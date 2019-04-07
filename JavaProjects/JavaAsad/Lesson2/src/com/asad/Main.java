package com.asad;

public class Main {

    public static void main(String[] args) {



        byte byreValue =  10;
        short shortvalue = 20;
        int intValue = 50;
        long longResult =  5000L + 10L  * (byreValue + shortvalue + intValue);
        short shortResult =  (short) (1000 + 10 * (byreValue + shortvalue + intValue));

        System.out.println(longResult);
        System.out.println(shortResult);


/*
        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int mytTotal = (myMinValue / 2);
        System.out.println("myTotal = " + mytTotal);

        // byte has a width of 8
        byte myByteValue = - 128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue =" + myByteValue);
       // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);


        // Long has a width of 64
       long myLongValue = 100L;   // 9223372836853755807L
*/


    }
}