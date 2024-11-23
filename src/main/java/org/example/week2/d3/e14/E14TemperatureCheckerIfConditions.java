package org.example.week2.d3.e14;

public class E14TemperatureCheckerIfConditions {
    public static int temperature = 25;

    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value
        int temperature = 25;


        // Check the temperature and print the message
        if (temperature >= 30) {
            System.out.println(" It is hot outside");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("It's warm outside.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println(" It is cool outside");
        } else if (temperature < 10) {
            System.out.println(" It is cold outside");
        }
        else {
            System.out.println(" That is an invalid temperature");
        }


        // Declare the temperature variable as public and static

    }
}
