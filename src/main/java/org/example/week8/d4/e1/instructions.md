# Declaring and Accessing Instance Variables

## Objective
Learn how to declare and access instance variables in Java by creating a class that holds information about a student.

## Instructions

**Declaring and Accessing Instance Variables**

In this exercise, you will declare three instance variables in a class and assign values to them from the `main` method. This will help you understand how to use instance variables to store data related to an object and how to access and modify those values in other methods.

**For you to do:**

1. **Declare Instance Variables**
    - Declare three instance variables to hold:
        - **year** (int)
        - **schoolName** (String)
        - **batchNumber** (int)
    - These variables should be declared inside the class but outside of any method so that they can be accessed by all methods in the class.

2. **Assign Values to Instance Variables**
    - In the `main` method:
        - Create an instance of the class.
        - Using the created instance, assign the following values to the instance variables:
            - `year` = 2050
            - `schoolName` = "Syntax"
            - `batchNumber` = 200

3. **Print the Values**
    - After assigning values to the instance variables, print them in this format:
      ```
      I am a student of batch 200 studying at Syntax in the year of 2050.
      ```

4. **Understand Instance Variables**
    - **What Are Instance Variables?**
        - Instance variables are variables that belong to an instance (object) of a class. Each time you create an object, a unique set of instance variables is created for that object, allowing each object to store its own data.
        - These variables are declared inside the class but outside of methods, so they can be accessed by any method within the class. Instance variables retain their values as long as the object exists.
    - **Why Use Instance Variables?**
        - **Object-Specific Data:** Instance variables are useful when you need each object of the class to hold its own data. For example, in this exercise, each student can have their own unique year, school name, and batch number.
        - **Data Encapsulation:** Instance variables allow you to encapsulate the data within an object, meaning each object can have its own state, and methods of the class can modify or access this state as needed.
        - **Reusability:** By defining instance variables, you can reuse the class to create multiple objects, each with different data, without needing to rewrite code or create new variables every time.
    - **When to Use Instance Variables:**
        - Use instance variables when the data should be tied to a specific object rather than shared across all instances of a class.
        - For example, in a banking application, each customer’s account balance would be an instance variable because each customer has a unique balance.

