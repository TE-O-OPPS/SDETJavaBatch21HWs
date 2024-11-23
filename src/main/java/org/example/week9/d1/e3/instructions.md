# Implementing Inheritance in a Banking System

## Objective
Learn how to implement inheritance in Java by creating a hierarchy of classes that represent different types of bank accounts. You will practice creating properties (instance variables) and methods in each class, and understand how subclass objects can inherit and extend the functionality of their superclasses.

## Instructions

**Step 1: Create the `BankAccount` Class**

1. **Create the `BankAccount.java` class** with the following instance variables:
    - `accountHolderName`: Stores the name of the account holder. (String)
    - `balance`: Stores the current balance in the account. (double)
    - `accountNumber`: Stores the account number. (String)

   **Method Implementation:**
    - **Constructor:** Create a constructor that initializes all instance variables.
    - **Deposit Method:** Define a method `deposit(double amount)` that increases the balance by the specified amount.
    - **Withdraw Method:** Define a method `withdraw(double amount)` that decreases the balance by the specified amount, if there are sufficient funds.
    - **Print Account Info Method:** Define a method `printAccountInfo()` that prints the account holder's name, account number, and balance.

   **Example Implementation (Explanation):**
    - The `deposit` method should add the amount to the balance.
    - The `withdraw` method should subtract the amount from the balance only if the balance is greater than or equal to the amount; otherwise, it should print a warning message.
    - The `printAccountInfo` method should print all the account details in a readable format.

**Step 2: Create the `SavingsAccount` Class that Extends `BankAccount`**

1. **Create the `SavingsAccount.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `SavingsAccount` class a subclass of the `BankAccount` class.
    - **Instance Variables:**
        - `interestRate`: Stores the interest rate for the savings account. (double)
    - **Method:** Define a method `applyInterest()` that calculates the interest based on the current balance and the interest rate, then adds this interest to the balance.

   **Example Implementation (Explanation):**
    - The `applyInterest` method should multiply the balance by the interest rate and add the resulting amount to the balance.

   **Example Usage:**
    - You could create a savings account with a specific interest rate and then apply the interest to see the balance grow over time.

**Step 3: Create the `CheckingAccount` Class that Extends `BankAccount`**

1. **Create the `CheckingAccount.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `CheckingAccount` class a subclass of the `BankAccount` class.
    - **Instance Variables:**
        - `overdraftLimit`: Stores the overdraft limit for the checking account. (double)
    - **Method Override:** Override the `withdraw(double amount)` method to allow overdraft up to the overdraft limit.

   **Example Implementation (Explanation):**
    - The `withdraw` method should allow withdrawals that bring the balance below zero but not lower than the overdraft limit.

   **Example Usage:**
    - You could create a checking account with a specific overdraft limit and test withdrawing more money than the current balance to see how the overdraft is handled.

**Step 4: Test the Classes in the `E151Inheritance` Class**

1. **Use the existing `E3Inheritance.java` class** to test your `SavingsAccount` and `CheckingAccount` classes:
    - **Object Creation:** Create objects for `SavingsAccount` and `CheckingAccount`.
    - **Method Calls:** Call methods to deposit, withdraw, apply interest, and print account information.

   **Example Steps (Explanation):**
    - Create a `SavingsAccount` object with an initial balance and an interest rate, deposit some money, apply interest, and print the account info.
    - Create a `CheckingAccount` object with an initial balance and an overdraft limit, withdraw money (including an overdraft scenario), and print the account info.

   **Expected Output:**
    - The output should show how deposits, withdrawals, interest application, and overdrafts affect the account balances.

   **Example Output:**
    - ```
      Account Holder: John Doe
      Account Number: 123456789
      Balance: 1050.0

      Account Holder: Jane Smith
      Account Number: 987654321
      Balance: -50.0
      ```

**Step 5: Run and Test Your Application**

1. **Run Your Program:**
    - Execute your program to verify that the output matches the expected results.

2. **Test Your Application:**
    - Use a testing framework (e.g., JUnit) to write test cases that verify the functionality of deposits, withdrawals, interest application, and overdraft handling.

   **Testing Details:**
    - Capture the output of the account operations.
    - Compare the captured output against expected results for various scenarios (e.g., normal withdrawal, overdraft, interest application).

## Tips:

- **Inheritance:** Understand how subclasses (`SavingsAccount`, `CheckingAccount`) inherit properties and methods from the superclass (`BankAccount`).
- **Method Overriding:** Learn how to override methods in the subclass to provide specific functionality (e.g., overdraft handling in `CheckingAccount`).
- **Real-Life Application:** Recognize how these concepts apply in real-world banking systems, where different account types have specific behaviors.

By completing this exercise, you will gain experience in implementing inheritance, method overriding, and working with real-world scenarios in Java. Happy coding!
