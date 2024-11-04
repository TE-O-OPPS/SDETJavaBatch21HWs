package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork8 {
    public static void main(String[] args) {
        //print max and min numbers from an array.
        int []array={1,2,3,4,5,6,};
        int max=array[0];
        int min=array[0];
        for(int i =0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }else {
            if(array[i]<min){
                min=array[i];
            }
        }}
        System.out.println("The maximum number is "+ max);
        System.out.println("The minimum number is " + min);
    }
}
