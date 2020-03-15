package com.mattintech.fintools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BadMethods badMethods;

    Button btnDBZ, btnAnr, btnNpe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiInit();
        badMethods = new BadMethods();
    }

    private void uiInit() {
        btnAnr = findViewById(R.id.btn_anr);
        btnDBZ = findViewById(R.id.btn_div_by_zero);
        btnNpe = findViewById(R.id.btn_npe);

        btnAnr.setOnClickListener(this);
        btnDBZ.setOnClickListener(this);
        btnNpe.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_anr:
                Toast.makeText(this, "Click button multiple times",
                        Toast.LENGTH_SHORT).show();
                badMethods.createAnr(10000l);
                break;
            case R.id.btn_div_by_zero:
                Toast.makeText(this, "Trying to divide by zero",
                        Toast.LENGTH_SHORT).show();
                badMethods.divByZero(5);
                break;
            case R.id.btn_npe:
                Toast.makeText(this, "Null pointer Exception",
                        Toast.LENGTH_SHORT).show();
                badMethods.npe();
                break;
            default:

        }
    }
}
