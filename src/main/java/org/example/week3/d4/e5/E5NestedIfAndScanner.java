package org.example.week3.d4.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        // Capture the three numbers input
        int number1= scan.nextInt();
        int number2= scan.nextInt();
        int number3 = scan.nextInt();
        // Use nested if-else statements to find the largest number
        if(number1>number2 ){
            if(number1>number3){
                System.out.println("The largest number is " + number1 );
            } else{
                System.out.println("The largest number is " + number3);
            }

        } else{
            if(number2>number1){
                if (number2>number3){
                    System.out.println("The largest number is " + number2);
                } else{
                    System.out.println("The largest number is " + number3);
                }

            }

        }




    }
}
