package com.bridgelabz;

import java.util.Scanner;


public class LineComparisons {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Values");
        //Given input value
        Integer x1= input.nextInt();
        Integer x2= input.nextInt();
        Integer y1= input.nextInt();
        Integer y2= input.nextInt();

        Integer a1= input.nextInt();
        Integer a2= input.nextInt();
        Integer b1= input.nextInt();
        Integer b2= input.nextInt();

        //Length of line calculation
        Double lengthOne = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        Double lengthTwo = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal");
        }

        //Given compare two value and use compareTo method
        int diffInLength = lengthOne.compareTo(lengthTwo);
        if (diffInLength == 0) {
            System.out.println("Equal of line length");
        } else if (diffInLength > 0) {
            System.out.println("Line1 is greater in length than lengthOne ");
        } else {
            System.out.println("Line1 is smaller in length than lengthTwo ");

        }


    }
}

