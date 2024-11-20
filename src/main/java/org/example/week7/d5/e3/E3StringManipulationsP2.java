package org.example.week7.d5.e3;

public class E3StringManipulationsP2 {
    public static void main(String[] args) {
        String email= "Jhon2003@example.com";
        int index = email.indexOf('@');//8
        //System.out.println(index);
        String domain = email.substring(index+1);

        System.out.println("Contains '@'? "+ email.contains("@"));
        System.out.println("Starts with 'info'? "+ email.startsWith("info"));
        System.out.println("Ends with '.com'? "+ email.endsWith("com"));
        System.out.println("Domain name: "+domain);
    }
}
