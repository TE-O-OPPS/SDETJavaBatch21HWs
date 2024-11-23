package org.example.week2.d3.e13;

public class E13DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        float morningExpense = 25.0f;
        float afternoonExpenses = 25.0f;
        float eveningExpense = 26.25f;

        // Calculate total expense
           float totalExpenses= morningExpense + afternoonExpenses + eveningExpense;
        System.out.println("Your total daily expense is: " +  totalExpenses);
           // Define a budget
        float budget = 100;
        if(budget<=100){
            System.out.println("You are within the budget.");
        }
        else {
            System.out.println("Your daily expense is over the budget.");
        }



        // Check if within budget


    }
}
