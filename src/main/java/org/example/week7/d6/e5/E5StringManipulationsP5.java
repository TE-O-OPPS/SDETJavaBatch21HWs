package org.example.week7.d6.e5;

public class E5StringManipulationsP5 {
    public static void main(String[] args) {
        String csvLine = "John Doe,22,Computer Science,3.8,2025";
        //csvLine.length()
String []strings  = csvLine.split(",");
String name=strings[0];
String age=strings[1];
String major =strings[2];
String gpa=strings[3];
String year=strings[4];
// Split the full name by space to separate first and last names
        String[] parts = name.split(" ");
        // Count the number of parts (words) in the full name
        int wordCount = parts.length;


        System.out.println("Name: "+name);
        System.out.println("Age: " + age);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        System.out.println("Graduation Year: "+ year);
        System.out.println("Name Word Count: "+ wordCount);
        System.out.println("Major Length: "+major.length());







    }
}
