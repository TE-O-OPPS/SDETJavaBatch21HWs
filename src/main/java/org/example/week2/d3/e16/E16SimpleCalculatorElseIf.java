package org.example.week2.d3.e16;

import java.util.Scanner;

public class E16SimpleCalculatorElseIf {
    public static void main(String[] args) {
        //Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the operator
         System.out.println("Enter operator (+, -, *, /):");
         // create a variable operator .
          String operator = scanner.next();
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");;
        Double num2 = scanner.nextDouble();
        // Perform operation using if-else if-el
        // se conditions
        if (operator.equals("+")) {
            double result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            double result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            double result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }

        // Close the scanner
        scanner.close();

    }
}
