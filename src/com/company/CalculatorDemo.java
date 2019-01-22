package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator myArea = new Calculator ();

        myArea.setHeight(5);
        myArea.setWidth(10);

        System.out.println ("The rectangle's area is " + myArea.calculateArea(myArea.getHeight(), myArea.getWidth()));

    }
}
