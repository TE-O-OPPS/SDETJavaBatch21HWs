package org.example.week2.d2.e10;

public class E10UserInformationAndAgeCheckIfConditions {
    public static void main(String[] args) {
        // Declare a string variable called name and assign it the value "Weqas"
        String name;
        name ="Weqas";

        // Declare a string variable called mobileNumber and assign it the value "123-456-7890"
        String mobileNumber ;
        mobileNumber= " 123-456-7890";
        // Declare an integer variable called age and assign it the value 45

        int age;
        age = 45;
        // Print the user's information
        System.out.println("Your name is "+ name+", your age is "+ age+", and your mobile number is" + mobileNumber );

        // Check if the user is 18 or older
        if(age>  18) {
            System.out.println("You are an adult.");
        }
        else {
            System.out.println("You are not an adult.");
        }

    }
}