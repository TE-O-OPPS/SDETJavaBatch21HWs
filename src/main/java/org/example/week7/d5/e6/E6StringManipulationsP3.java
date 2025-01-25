package org.example.week7.d5.e6;

public class E6StringManipulationsP3 {
    public static void main(String[] args) {
String sentence = "The quick brown fox jumps over the lazy dog.";
int positionOfO = sentence.indexOf('o');
int positionOfJump= sentence.indexOf("jumps");
int positionOfzAfter20 = sentence.indexOf('z',20);
int positionOfcat = sentence.indexOf("cat");
        System.out.println("Position of first 'o': "+positionOfO);
        System.out.println("Position of \"jumps\": "+positionOfJump);
        System.out.println("Position of 'z' after index 20: "+positionOfzAfter20);
        System.out.println("Position of \"cat\": "+positionOfcat);
        //IN java the indexOf() methodes does not find the spesified character or substring
        // in the string it will always returns negative -1
    }
}
