package org.example.week7.d6.e1;

public class E1StringManipulationsP4 {
    public static void main(String[] args) {
String dataString="ID:12345-NAME:John Doe-AGE:30-CITY:NEW York";
int idstart =dataString.indexOf("ID:")+3;
int idend= dataString.indexOf("-NAME:");
String id = dataString.substring(idstart,idend);
// extract the full name John doe
        int nameStart =dataString.indexOf("NAME:")+5;
        int nameEnd= dataString.indexOf("-AGE");
        String name = dataString.substring(nameStart,nameEnd);
        // extract age 30.
        int ageStart= dataString.indexOf("AGE:")+4;
        int ageEnd = dataString.indexOf("-CITY");
        String age = dataString.substring(ageStart,ageEnd);
        //extract everything from the city field
        int cityStart = dataString.indexOf("30-")+3;
        String cityInfo = dataString.substring(cityStart);
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("City Info: "+cityInfo);






    }
}
