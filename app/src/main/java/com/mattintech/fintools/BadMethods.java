package com.mattintech.fintools;

/*
 * Created by mhills on 2020-03-15.
 */

public class BadMethods {


    public void createAnr(Long waitTime) {

        Thread thread = new Thread();

        try {
            thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    public int divByZero(int num) {

        return num/0;
    }

    public void npe() {
        Object obj = null;
        obj.hashCode();

    }

}
