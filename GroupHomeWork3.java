package org.example.project.homeworkTekiaJavaCodingAssignment;

public class GroupHomeWork3 {
    public static void main(String[] args) {
        int[][] numbers = {{4, 5, 6},
                {7, 8, 9},
                {10, 11, 21}};
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
               if(numbers[i][j]%2==0){
                   System.out.println(numbers[i][j]+" ");
               }
            }

        }

        }

    }
