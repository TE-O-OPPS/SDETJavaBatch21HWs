package org.example.week2.d1.e5;

public class E5PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlice= 13;
          int friends= 4;

        // Calculate slices per person
         int slicePerPerson = totalSlice/friends;

         // left over
         int leftOver = totalSlice%friends;

         // Print the results
        System.out.println("Each person gets " + slicePerPerson + " slices.");
        System.out.println("There are " + leftOver + " slices left over.");

    }
}
