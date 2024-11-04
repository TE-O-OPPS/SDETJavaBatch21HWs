package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork7 {
    public static void main(String[] args) {
// Write a Java Program to print the first 10 numbers of the Fibonacci series.

        int a = 0,b=1;
        int c;
        System.out.println(a+""+b);
        for(int i =3;i<=10;i++){
            c= a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
    }
}
