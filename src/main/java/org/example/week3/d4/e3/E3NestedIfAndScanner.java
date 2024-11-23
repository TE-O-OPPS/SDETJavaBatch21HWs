package org.example.week3.d4.e3;

import java.util.Scanner;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F");
        // Capture the gender input
        String gender = scan.next();

        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age = scan.nextInt();
        if(age>25) {
            if(gender.equalsIgnoreCase("F")){
                System.out.println("Women");
            } else {
                System.out.println("man");
            }

        }else{
            if(age<=25) {
                if(gender.equalsIgnoreCase("F")){
                    System.out.println("Girl");
                }
                else {
                    System.out.println("Boy");
                }
            }
        }


        // Classify based on gender and age


        // Create a Scanner object to read input from the console
         }
        }