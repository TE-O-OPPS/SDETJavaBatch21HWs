package org.example.week7.d5.e2;

public class E2StringManipulationsP2 {
    public static void main(String[] args) {

        String str1 = " Learn Java ";
        String str2 = "\tPractice Makes Perfect\t";

        String trimmedStr1 = str1.trim();
        String trimmedStr2 = str2.trim();
        trimmedStr2 = trimmedStr2.replace("\t", "");
        System.out.println("Original str1: '  " +  str1 +   "  '");
        System.out.println("Trimmed str1: '" + trimmedStr1 + "'");
        System.out.println("Original str2: '" + str2 + "'");
        System.out.println("Trimmed str2: '" + trimmedStr2 + "'");


    }
}
