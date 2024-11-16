# Implementing an Employee Class with Constructors and a Print Method

## Objective
Learn how to define and use instance variables, constructors (both non-argument and parameterized), and methods in a Java class. You will practice creating multiple objects and displaying their details, demonstrating how constructors initialize object properties.

## Instructions

**Step 1: Define Class Variables in Employee Class**

1. **Create the `Employee.java` class** and define the following instance variables:
    - `name`: Stores the first name of the employee. (String)
    - `lastName`: Stores the last name of the employee. (String)
    - `employeeId`: Stores the unique ID of the employee. (int)
    - `startDate`: Stores the start date of the employee. (String)
    - `salary`: Stores the salary of the employee. (int)

   **Note:** Ensure all instance variables are properly encapsulated and follow standard naming conventions.

**Step 2: Implement Constructors**

1. **Non-Argument Constructor:**
    - Create a no-argument (default) constructor that initializes the instance variables to their default values.
    - **Default Values:** Strings should be initialized to `null`, and integers to `0`.

2. **Parameterized Constructor:**
    - Create a constructor that accepts parameters for all the instance variables (`name`, `lastName`, `employeeId`, `startDate`, `salary`).
    - This constructor should initialize the instance variables with the provided values.

   **Example Constructor Implementation (Explanation):**
    - The no-argument constructor should set all variables to default values.
    - The parameterized constructor should set each variable with the corresponding argument passed during object creation.

**Step 3: Create a Method to Print Employee Details**

1. **Create a method called `printDetails`** in the `Employee` class that prints the values of all instance variables in a single line, separated by spaces.

   **Output Format (Explanation):**
    - The method should concatenate the `name`, `lastName`, `employeeId`, `startDate`, and `salary` into a single string and print this string to the console.
    - The output should look like: `Name LastName EmployeeId StartDate Salary`. For example, "Joe Smith 12345 01011970 35000".

**Step 4: Test the Employee Class in the Main Class**

1. **In the `Main` class:**
    - Create two objects of the `Employee` class:
        - The first object should be created using the non-argument constructor.
        - The second object should be created using the parameterized constructor with values like "Joe", "Smith", 12345, "01011970", and 35000.
    - Use the method created in Step 3 to print the details of each `Employee` object.

   **Example Steps (Explanation):**
    - Create an object of the `Employee` class using the non-argument constructor.
    - Create another object of the `Employee` class using the parameterized constructor with the specified values.
    - Call the method that prints the details of each employee, and ensure the output is formatted correctly as described above.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

### Example Output:

- When you run your program, you should see the following output:

  ```
  null null 0 null 0
  Joe Smith 12345 01011970 35000
  ```

## Tips:

- **Constructors:** Ensure that the no-argument constructor properly initializes all instance variables to their default values. The parameterized constructor should use the arguments provided to set each variable.
- **Encapsulation:** Ensure that all instance variables are defined as `private` and are only accessible through the class's methods.
- **Method Naming:** Follow Java naming conventions, using camelCase for method names (e.g., `printDetails`).

By completing this exercise, you will gain a better understanding of how to work with instance variables, constructors, and methods in Java. Happy coding!
