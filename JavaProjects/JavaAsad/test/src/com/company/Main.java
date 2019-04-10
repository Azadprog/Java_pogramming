package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall Trump = new Wall(5,4);
        System.out.println("area= " + Trump.getArea());

        Trump.setHeight(-1.5);
        System.out.println("width= " + Trump.getWidth() );
        System.out.println("height=" +  Trump.getHeight() );
        System.out.println("area= " + Trump.getArea() );

    }
}
