# Implementing Multilevel Inheritance in Java

## Objective
Learn how to implement multilevel inheritance in Java by creating a hierarchy of classes that extend from a base class. You will practice creating properties (instance variables) and methods in each class and understand how subclass objects can inherit properties and methods from their superclasses.

## Instructions

**Step 1: Create the `Person` Class**

1. **Create the `Person.java` class** with the following instance variables:
    - `name`: Stores the first name of the person. (String)
    - `lastName`: Stores the last name of the person. (String)
    - `age`: Stores the age of the person. (int)

   **Note:** Ensure that all instance variables are defined as `private` to ensure encapsulation, and provide public getter and setter methods if needed.

**Step 2: Create the `Employee` Class that Extends `Person`**

1. **Create the `Employee.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `Employee` class a subclass of the `Person` class.
    - **Instance Variables:**
        - `salary`: Stores the salary of the employee. (int)
    - **Method:** Define a `printEmployeeDetails` method in the `Employee` class that prints the `name`, `lastName`, `age`, and `salary` in a single line.

   **Example Implementation (Explanation):**
    - The `printEmployeeDetails` method should access the inherited properties from `Person` and print them along with the `salary`.

   **Example Output:**
    - `"Joe Smith 35 35000"`

**Step 3: Create the `Student` Class that Extends `Employee`**

1. **Create the `Student.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `Student` class a subclass of the `Employee` class.
    - **Instance Variables:**
        - `grade`: Stores the grade of the student. (int)
    - **Method:** Define a `printStudentDetails` method in the `Student` class that prints the `name`, `lastName`, `age`, `grade`, and other inherited properties in a single line.

   **Example Implementation (Explanation):**
    - The `printStudentDetails` method should access the inherited properties from both `Person` and `Employee` classes and print them along with the `grade`.

   **Example Output:**
    - `"Adam Smith 15 10"`

**Step 4: Create the `Retiree` Class that Extends `Student`**

1. **Create the `Retiree.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `Retiree` class a subclass of the `Student` class.
    - **Instance Variables:**
        - `seniorActivity`: Stores the activity the retiree enjoys. (String)
    - **Method:** Define a `printRetireeDetails` method in the `Retiree` class that prints the `name`, `lastName`, `age`, `seniorActivity`, and other inherited properties in a single line.

   **Example Implementation (Explanation):**
    - The `printRetireeDetails` method should access the inherited properties from `Person`, `Employee`, and `Student` classes and print them along with the `seniorActivity`.

   **Example Output:**
    - `"Frank Smith 15 tour"`

**Step 5: Test the Classes in the Main Class**

1. **Use  the `E2Inheritance.java` class** and do the following inside it:
    - **Object Creation:** Create objects for each of the `Employee`, `Student`, and `Retiree` classes.
    - **Method Calls:** Call the appropriate print method for each object to display the details as described in the output.

   **Example Steps (Explanation):**
    - Create an object of the `Employee` class, initialize its properties, and call `printEmployeeDetails`.
    - Create an object of the `Student` class, initialize its properties, and call `printStudentDetails`.
    - Create an object of the `Retiree` class, initialize its properties, and call `printRetireeDetails`.

   **Expected Output:**
    - The output should match the following format:
    - ```
      Joe Smith 35 35000
      Adam Smith 15 10
      Frank Smith 15 tour
      ```

**Step 6: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

## Tips:

- **Multilevel Inheritance:** Understand how multilevel inheritance allows a subclass to inherit properties and methods from all its ancestor classes.
- **Method Overriding:** Although this exercise doesn’t explicitly involve method overriding, recognize that subclasses can override methods from their superclasses if needed.
- **Constructor Use:** Consider how constructors in each class can be used to initialize properties inherited from parent classes.

By completing this exercise, you will gain experience in implementing multilevel inheritance in Java, using realistic classes that demonstrate how properties and methods are inherited through a class hierarchy. Happy coding!
