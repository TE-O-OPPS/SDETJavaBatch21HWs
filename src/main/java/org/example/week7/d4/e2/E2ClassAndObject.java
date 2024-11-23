package org.example.week7.d4.e2;

public class E2ClassAndObject {

    public static void main(String[] args) {
       Car car1 = new Car();
        car1.carColor= "Black";
        car1.carYear= 2019;
        car1.carMake= "BMW";
        System.out.println("Car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);

       Car car2= new Car();
        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";
        System.out.println("Car color is "+ car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);






    }
}
