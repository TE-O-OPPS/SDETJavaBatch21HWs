package org.example.week3.d6.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int mealType = scan.nextInt();
        switch (mealType) {

            case 1:
                System.out.println("The price of your meal is $5.0");
                break;
            case 2:
                System.out.println("The price of your meal is $10.0");
                break;
            case 3:
                System.out.println("The price of your meal is $15.0");
                break;
            default:
                System.out.println("Invalid meal type entered");

        }


        // Print the price
        // Output: The price of your meal is $____


        // Print the price

    }
}
