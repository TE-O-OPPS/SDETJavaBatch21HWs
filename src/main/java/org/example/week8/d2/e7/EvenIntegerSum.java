package org.example.week8.d2.e7;

public class EvenIntegerSum {

    public int sumEvenToX(int x){
        int sum=0;
        for (int i=0;i<x;i++){
           if(i%2==0){
               sum+=i;
           }
        }
        return sum;

    }


}
