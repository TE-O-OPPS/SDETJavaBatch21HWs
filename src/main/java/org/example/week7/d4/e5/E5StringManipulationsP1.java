package org.example.week7.d4.e5;

public class E5StringManipulationsP1 {
    void concat(){
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a String variable named 's1' and assign the value "hello" to it
        String s1= "Hello";
        String s2= "World";
        String s3 = "";
        s1= s1.concat(" ");
        s3= s1.concat(s2);
        System.out.println(s3);


    }
}
