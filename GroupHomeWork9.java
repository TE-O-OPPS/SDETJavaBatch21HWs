package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork9 {
    public static void main(String[] args) {

        // Write a program to print out duplicate elements from an Array of Strings.

                String[] array = {"apple", "banana", "orange", "apple", "kiwi", "banana"};

                boolean foundDuplicate = false;

                System.out.println("Duplicate elements:");
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i].equals(array[j])) {
                            System.out.println(array[i]);
                            foundDuplicate = true;
                            break;
                        }
                    }
                }

                if (!foundDuplicate) {
                    System.out.println("No duplicate elements found.");
                }
            }
        }






