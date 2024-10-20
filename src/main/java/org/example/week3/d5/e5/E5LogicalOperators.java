package org.example.week3.d5.e5;

import java.util.Scanner;

public class E5LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");
        // Capture the mark input
        int mark = scan.nextInt();
        // Determine the grade based on the mark

        if (mark >= 1 && mark <= 25) {
            System.out.println("Your grade is F");
        } else if (mark >= 26 && mark <= 45) {
            System.out.println("Your grade is E");
        } else if (mark >= 46 && mark <= 50) {
            System.out.println("Your grade is D");
        } else if (mark >= 50 && mark <= 60) {
            System.out.println("Your grade is C");
        } else if (mark >= 61 && mark <= 80) {
            System.out.println("Your grade is B");
        }else if (mark > 80 && mark <= 100) {
            System.out.println("Your grade is A");}
        else {
            System.out.println("Please enter a valid mark");


            }


            // Print the grade
            // Output: Your grade is ____


        }
    }
