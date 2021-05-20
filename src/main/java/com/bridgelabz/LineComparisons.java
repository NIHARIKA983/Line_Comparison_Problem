package com.bridgelabz;
import java.util.Scanner;

public class LineComparisons {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        //Given input value
        int x1= input.nextInt();
        int x2= input.nextInt();
        int y1= input.nextInt();
        int y2= input.nextInt();

        //Length of line calculation
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of the Two End Points ==> "+ length);



    }
}

