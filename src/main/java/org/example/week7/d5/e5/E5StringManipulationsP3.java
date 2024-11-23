package org.example.week7.d5.e5;

public class E5StringManipulationsP3 {
    public static void main(String[] args) {
String emailAddress ="user@example.com";
char firstChar= emailAddress.charAt(0);
//checking if the character's unicode value is between 'a' and 'z'(for lower case letter).
        boolean startWithLetter=(firstChar>='a'&& firstChar<='z'||firstChar>='A'&&firstChar<='Z');
        //extract the 5th character (index4)
        char fifthChar=emailAddress.charAt(4);
        //check if the 5th character @
        boolean atSymbole = fifthChar=='@';
        System.out.println("Email starts with a letter: "+startWithLetter);
        System.out.println("5th character is @: "+atSymbole);
    }
}
