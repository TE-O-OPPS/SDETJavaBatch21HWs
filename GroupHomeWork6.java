package org.example.project.homeworkTekiaJavaCodingAssignment;

import java.util.Scanner;

public class GroupHomeWork6 {
    public static void main(String[] args) {
        // check whether a given number is prime or not.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        boolean isPrime= true; // let us assume the number is  prime.
        if(num<=1){
            isPrime=false;
        } else {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        scan.close();
    }
}
