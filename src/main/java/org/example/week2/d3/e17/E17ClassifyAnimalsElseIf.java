package org.example.week2.d3.e17;

public class E17ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal = "dog";

        // Use if-else-if conditions to classify the animal
        if (animal.equals("dog")) {
            System.out.println("The animal is a mammal.");
        } else if (animal.equals("Eagle")) {
            System.out.println("The animal is a bird.");
        } else if (animal.equals("Shark")) {
            System.out.println("The animal is a fish.");
        } else if (animal.equals("Frog")) {
            System.out.println("The animal is a amphibian.");
        } else if (animal.equals("Snake")) {
            System.out.println("The animal is a reptile.");
        } else {
            System.out.println("The animal is Unknown an animal.");
        }
    }
}