package org.example.week7.d5.e4;

public class E4StringManipulationsP3 {
    public static void main(String[] args) {
        String productCode = "KX125";
       char firstCharacter;
       char lastCharacter='\0';// to assign default value
        for (int i = 0; i <productCode.length() ; i++) {
            if(i==0){

            firstCharacter= productCode.charAt(i);
                System.out.print("Product code starts with "+ "'"+firstCharacter+"': ");
                System.out.print(productCode.startsWith("K"));
        }
            if(i==productCode.length()-1){
                lastCharacter=productCode.charAt(i);
                System.out.println();
                System.out.print("Product code ends with "+"'"+lastCharacter+"': ");
            }}
        boolean isLastCharacterDigit=Character.isDigit(lastCharacter);
        System.out.print( isLastCharacterDigit);
        System.out.println();

       /* char firstChar = productCode.charAt(0);
        System.out.print("Product code starts with "+ "'"+firstChar+"': ");
        System.out.print(productCode.startsWith("K"));
        System.out.println();
        char lastChar= productCode.charAt(productCode.length()-1);
        System.out.print("Product code ends with "+"'"+lastChar+"'");
       boolean isLastCharacterDigit=Character.isDigit(lastChar);
      System.out.print("Product code ends with "+"'"+lastChar+"'");*/

    }
}
