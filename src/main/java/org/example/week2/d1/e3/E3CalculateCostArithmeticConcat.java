package org.example.week2.d1.e3;

public class E3CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare Variables and Assign Prices
        // Step 2: Perform Operations to calculate total and average cost
        // Step 3: Print Values

        float item1;
        item1 = 15.5f;
        float item2;
        item2 = 23.0f;
        float item3;
         item3 =9.99f;
         float item4;
           item4 = 27.49f;
           // calculate total prices.
        float totalCost;
        totalCost = item1 + item2 + item3 + item4;
        float averageCost;
        averageCost = totalCost/4;
        // display the results
        System.out.println("The total cost is " + totalCost);
        System.out.println("The average cost is " + averageCost);


    }
}
