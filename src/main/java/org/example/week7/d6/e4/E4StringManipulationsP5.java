package org.example.week7.d6.e4;

public class E4StringManipulationsP5 {
    public static void main(String[] args) {

        String []phoneNumbers= {"(123) 456-7890", "987-654-3210", "555.444.3333", "444 333 2222", "12345678901"};
       for (String phoneNumber:phoneNumbers){
           // remove all the none digit character with ^
           String numberOnly= phoneNumber.replaceAll("[^0-9]","");
           String formattedNumber;
           if(numberOnly.length()==10){
               formattedNumber=String.format("(%s) %s-%s",
               numberOnly.substring(0,3),
               numberOnly.substring(3,6),
              numberOnly.substring(6,10));
           }else {
               formattedNumber=numberOnly;
           }
           System.out.println("Original: " + phoneNumber+","+" Formatted: "+formattedNumber);
       }

    }
}
