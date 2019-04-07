package com.asad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // whidth of int = 32 (4 bytes)
        int myIntValue  = 5 / 2 ;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 2f;
        // witdh of byte = 64 (8 bytes)
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myIntValue " + myDoubleValue);



        double numPunds = 200d;
        double convertedKilograms = numPunds * 0.45359237d;
        System.out.println("killograms =" + convertedKilograms);


    }
}
