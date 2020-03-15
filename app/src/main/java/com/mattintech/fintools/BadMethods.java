package com.mattintech.fintools;

/*
 * Created by mhills on 2020-03-15.
 */

public class BadMethods {


    public void createAnr(Long waitTime) {

        //cause a wait on the UI thread > 500ms - Result = Application Not responding report (ANR)
        Thread thread = new Thread();
        try {
            thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    public int divByZero(int num) {
        //Attempt to device a number by Zero
        return num/0;
    }

    public void npe() {
        //reference a object not full initialized.
        Object obj = null;
        obj.hashCode();

    }

}
