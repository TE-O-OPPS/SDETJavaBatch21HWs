package org.example.week3.d4.e2;

import java.util.Scanner;

public class E2NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it sunny outside? (true/false)");
        ;boolean isSunny = scan.nextBoolean();

        if(isSunny){
            System.out.println("It is a sunny day, I should go somewhere!");
        } else {
            System.out.println("I stay home and practice Java");
        }
        //Declare an integer variable temperature.
        System.out.println("What is the temperature outside?");
        int temperature = scan.nextInt();
        if (temperature > 85) {
            System.out.println("I am going to the beach!");
        } else {
            System.out.println("I am going to the park!//");
        }

            }
    }

