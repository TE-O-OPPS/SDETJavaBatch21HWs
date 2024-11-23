# Working with Multiple Constructors and Class Variables in Java

## Objective
Learn how to create multiple constructors in a Java class that allow for flexible object creation. You will practice initializing class variables through different constructors and using a method to display their values.

## Instructions

**Creating the Car Class**

In this project, you will complete the `Car` class by creating instance variables, multiple constructors, and a method to display values. Each constructor will handle a different combination of parameters.

### Steps for You to Do:

1. **Declare Instance Variables:**
    - Create the following instance variables in the `Car` class (choose appropriate data types):
        - `make`
        - `model`
        - `numberOfDoors`
        - `topSpeed`
        - `price`

2. **Create Four Constructors:**
    - **First constructor:** Take all parameters (`make`, `model`, `numberOfDoors`, `topSpeed`, `price`).
    - **Second constructor:** Take all parameters **except `numberOfDoors`.** Inside the constructor, assign `numberOfDoors` to 4 by default.
    - **Third constructor:** Take all parameters **except `make` and `model`.** Inside the constructor, assign `make` and `model` to `"unknown"` by default.
    - **Fourth constructor:** Take all parameters **except `topSpeed` and `price`.** Inside the constructor, assign `topSpeed` to 90 and `price` to 0 by default.

3. **Create a Display Method:**
    - Write a method called `display()` that prints the values of the instance variables in the following format:
      ```
      make model numberOfDoors topSpeed price
      ```

### In the Main Class

4. **Create and Use Objects:**
    - In the `MainClass`, create several objects of the `Car` class using each of the four constructors.
    - Call the `display()` method on each object to print the values of the instance variables.

### Example Output:

- Example output for objects created with different constructors:
  ```
  Toyota Prius 4 120 30000.0
  Toyota Prius 4 120 30000.0
  unknown unknown 4 120 30000.0
  Toyota Prius 4 90 0.0
  ```

### Purpose:

- The purpose of this exercise is to practice using multiple constructors to initialize class variables. You will learn how to provide flexibility in object creation by creating constructors with different parameter sets, and display the values of instance variables using a method.

## Tips:
- Ensure that the correct default values are assigned inside the constructors where certain parameters are missing (e.g., assigning `"unknown"` for `make` and `model`).
- Use the `this` keyword to refer to the current object's instance variables in the constructors.

## Troubleshooting:
- If the output does not match the expected results, ensure that the correct constructor is being called and that the instance variables are initialized correctly.
- Check the `display()` method to ensure that the instance variables are printed in the correct format.

By completing this exercise, you will gain a deeper understanding of how to use multiple constructors to initialize class variables and provide flexibility in object creation. Happy coding!
