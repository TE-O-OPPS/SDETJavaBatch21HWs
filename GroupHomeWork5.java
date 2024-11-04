package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork5 {
    public static void main(String[] args) {
        // swapping two numbers without temporary variable.
        int a= 10;
        int b=20;
        a=a+b;//10+20=30 a now become 30
        b= a-b;//30-20=10 b now become 20 original value of a
        a=a-b;//30-10 = 10 original value of a
        System.out.println(" a = " +a);
        System.out.println("b = " + b);


    }
}
