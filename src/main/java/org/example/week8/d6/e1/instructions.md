# Working with Constructors and Class Variables in Java

## Objective
Learn how to create and use constructors in Java to initialize class variables, as well as create methods to display their values. You will practice working with both non-argument and parameterized constructors to initialize instance variables with default or specific values.

## Instructions

**Creating the SyntaxTechnologies Class**

In this project, you will complete the `SyntaxTechnologies` class by creating instance variables, constructors, and a method to display values.

### Steps for You to Do:

1. **Declare Instance Variables:**
    - Create the following instance variables in the `SyntaxTechnologies` class:
        - `schoolName` (String)
        - `batch` (int)
        - `year` (int)
        - `lastDayOfClass` (String)

2. **Create Two Constructors:**
    - **Non-argument constructor:** Initialize the instance variables with their default values (e.g., null for Strings, 0 for integers).
    - **Parameterized constructor:** Take four parameters (String `schoolName`, int `batch`, int `year`, String `lastDayOfClass`) and assign them to the instance variables.

3. **Create a Display Method:**
    - Write a method called `display()` that prints the values of the instance variables in the format:
      ```
      schoolName batch year lastDayOfClass
      ```

### In the Main Class:

4. **Create and Use Objects:**
    - In the `MainClass`, create two objects of the `SyntaxTechnologies` class:
        - One using the non-argument constructor.
        - One using the parameterized constructor.
    - Call the `display()` method on both objects to print the values of the instance variables.

### Example InputOutput:

- Example when using the non-argument constructor:
  ```
  null 0 0 null
  ```

- Example when using the parameterized constructor:
  ```
  Syntax 6 2020 07302020
  ```

### Purpose:

- The purpose of this exercise is to practice using constructors and managing instance variables in Java. You will learn how to create both non-argument and parameterized constructors, initialize instance variables, and display their values using a method.

## Tips:
- The non-argument constructor will automatically assign default values to instance variables (e.g., null for Strings and 0 for integers).
- Ensure that the parameterized constructor correctly assigns the passed values to the instance variables using the `this` keyword.

## Troubleshooting:
- If the output does not match the expected results, ensure that the correct constructor is being called and that the instance variables are initialized as expected.
- Check the `display()` method to ensure that the instance variables are being printed in the correct format.

By completing this exercise, you will gain a solid understanding of how to use constructors to initialize class variables and how to manage instance variables in Java. Happy coding!
