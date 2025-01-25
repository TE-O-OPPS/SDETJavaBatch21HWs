package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork1 {
    public static void main(String[] args) {
        double [] temprature={32.0, 34.5, 35.0,36.5, 37.0,38.5, 40.0};
        double highest = temprature[0];
        double lowest = temprature[0];
        //we need to create enhanced for loop
        for(double temp:temprature){
            if(temp>highest){
                highest=temp;
            }
            if(temp<lowest){
                lowest= temp;
            }
        }
        System.out.println("Highest temperature of the week is: "+ highest);
        System.out.println("Lowest temperature of the week is: " + lowest);


    }
}
