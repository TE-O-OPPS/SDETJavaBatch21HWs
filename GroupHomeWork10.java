package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork10 {
    public static void main(String[] args) {
//find the largest second number in the array.

                int[] array = {5, 8, 2, 9, 1, 7};

                // Assume first two elements to start comparisons
                int largest = array[0];
                int secondLargest = Integer.MIN_VALUE;

                for (int i = 1; i < array.length; i++) {
                    if (array[i] > largest) {
                        secondLargest = largest; // Update second largest
                        largest = array[i];      // Update largest
                    } else if (array[i] > secondLargest && array[i] != largest) {
                        secondLargest = array[i];
                    }
                }

                if (secondLargest == Integer.MIN_VALUE) {
                    System.out.println("No second largest element found.");
                } else {
                    System.out.println("The second largest element is: " + secondLargest);
                }
            }
        }



