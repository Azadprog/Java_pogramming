package com.asad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Primitive data types is :
        // byte
        //short
        // int
        // long
        // float
        // double
        // char
        // boolean

        /* Ninth data type (Special Data type)  */
        // String

        String myString = " This is a String ";
        System.out.println(myString);
        myString = myString + ", and this is more. ";
        System.out.println(myString);
        myString = myString + "\u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "48.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println(lastString);
    }
}