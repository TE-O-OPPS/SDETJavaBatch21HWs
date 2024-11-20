package org.example.week7.d6.e2;

public class E2StringManipulationsP4 {
    public static void main(String[] args) {

       String longEntry= "2023-03-15 09:42:17 INFO [UserService] User 'jsmith'logged in from IP 192.168.1.101";

// extract the date 2023-03-15
        String date = longEntry.substring(0,10);
//Extract the time (09:42:17)
      String  time = longEntry.substring(11,19);
      //Extract the log level (INFO)
        String info=longEntry.substring(20,24);
        String serviceUser=longEntry.substring(26,37);
        String userName = longEntry.substring(45,51);
        int ipStart= longEntry.indexOf("IP")+3;
       String ipIdress = longEntry.substring(ipStart);
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Log Level: "+ info);
        System.out.println("Service: "+serviceUser);
        System.out.println("User: " +userName);
        System.out.println("IP Address: "+ipIdress);
    }
}
