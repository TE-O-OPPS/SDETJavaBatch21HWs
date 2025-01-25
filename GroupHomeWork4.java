package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork4 {
    public static void main(String[] args) {
        int [][] numbers ={{5,10,15},
                          {20, 25,30},
                          {35,40,45}};
        int evenSum=0;
        int oddSum=0;
        for (int i=0;i<numbers.length;i++) {
            for (int j = 0; j < numbers[i].length;j++){
                if(numbers[i][j]%2==0){
                    evenSum+=numbers[i][j];
                }else {
                    oddSum+= numbers[i][j];
                }
            }
        }
        System.out.println("The sum of the even number is " + evenSum);
        System.out.println("The sum of the odd number is "+oddSum);
    }
}
