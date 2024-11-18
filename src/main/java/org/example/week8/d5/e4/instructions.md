# Declaring Variables with Different Access Modifiers and Displaying Details

## Objective
Learn how to declare variables with different access modifiers in Java and display their values using a method.

## Instructions

**Declaring Variables with Different Access Modifiers**

In this project, you will declare four variables using different access modifiers (private, default, protected, and public) to hold values for name, city, school name, and batch number. You will then create a method to display these details in a specific format.

### Steps for You to Do:

1. **Declare Variables with Access Modifiers:**
    - Declare a private variable to hold the `name`.
    - Declare a default (package-private) variable to hold the `city`.
    - Declare a protected variable to hold the `school name`.
    - Declare a public variable to hold the `batch number`.

2. **Create a Method to Display Details:**
    - Create a method called `display` that prints the following message using the variables:
      ```
      My name is ___ and I live in ___. I study at ___ in batch ___
      ```

3. **Main Method:**
    - Inside the main method, assign values to the variables:
        - Assign "John" to `name`
        - Assign "Miami" to `city`
        - Assign "Syntax" to `school name`
        - Assign 9 to `batch number`
    - Call the `display` method to print the details.

### Example Output:

- Expected output:
  ```
  My name is John and I live in Miami. I study at Syntax in batch 9
  ```

### Purpose:

- The exercise demonstrates how to use different access modifiers (private, default, protected, and public) for variables and how to access them within a method to display formatted details.

## Tips:
- Ensure that the private variable is accessed within the same class, as it cannot be accessed outside of the class.
- Default access (package-private) variables can be accessed within the same package.
- Protected variables can be accessed from subclasses and within the same package.
- Public variables can be accessed from anywhere.

## Troubleshooting:
- If you encounter access errors, ensure that you are accessing the variables within the allowed access range based on their access modifier.
- Ensure that the `display` method correctly references each variable to generate the expected output.

By completing this exercise, you will better understand how to use access modifiers for variables in Java and how to display their values using a method. Happy coding!
