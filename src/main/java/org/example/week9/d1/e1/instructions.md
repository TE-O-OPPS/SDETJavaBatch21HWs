# Implementing Inheritance in Java

## Objective
Learn how to implement inheritance in Java by creating a superclass and a subclass that extend its functionality. You will practice creating methods in both classes and understand how subclass objects can call methods from both the superclass and the subclass.

## Instructions

**Step 1: Create a `Vehicle` Class**

1. **Create the `Vehicle.java` class** with the following:
    - **Instance Variables:**
        - `make`: Stores the manufacturer of the vehicle. (String)
        - `year`: Stores the year of manufacture. (int)
    - **Method:** Define a method called `displayInfo` in the `Vehicle` class that prints out the `make` and `year` of the vehicle.

   **Example Implementation (Explanation):**
    - The `displayInfo` method should be public and have a `void` return type.
    - It should print the vehicle's make and year in a readable format, e.g., `"Vehicle: Toyota, Year: 2020"`.

**Step 2: Create a `Car` Class that Extends the `Vehicle` Class**

1. **Create the `Car.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `Car` class a subclass of the `Vehicle` class.
    - **Instance Variables:**
        - `model`: Stores the model of the car. (String)
    - **Method:** Define a method called `displayCarInfo` in the `Car` class that prints out the `make`, `year`, and `model` of the car.

   **Example Implementation (Explanation):**
    - The `displayCarInfo` method should first call the `displayInfo` method from the `Vehicle` class to print the make and year.
    - Then, it should print the model of the car, e.g., `"Model: Corolla"`.

   **Note:** This setup demonstrates how the `Car` class can inherit properties and methods from the `Vehicle` class while adding its own specific details.

**Step 3: Create the Main Class to Test Inheritance**

1. **Use  the `E1Inheritance.java` class** and do the following inside it:
    - **Object Creation:** Create an object of the `Car` class and initialize it with the `make`, `year`, and `model`.
    - **Method Calls:** Use this object to call the `displayCarInfo` method, which will internally call the `displayInfo` method from the `Vehicle` class.

   **Example Implementation (Explanation):**
    - Instantiate an object of the `Car` class with values like `"Toyota"`, `2020`, and `"Corolla"`.
    - Call the method that displays the car’s full information including its make, year, and model.

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

### Example Output:

- When you run your program, you should see the following output:

  ```
  Vehicle: Toyota, Year: 2020
  Model: Corolla
  ```

## Tips:

- **Inheritance:** Remember that when the `Car` class extends the `Vehicle` class, it inherits all accessible members (methods and variables) from the `Vehicle` class.
- **Method Chaining:** You can call the `displayInfo` method from the `Vehicle` class within the `displayCarInfo` method in the `Car` class to show how inherited methods can be utilized.
- **Constructor Use:** You can optionally add a constructor in the `Car` class that calls the constructor of the `Vehicle` class using the `super` keyword to initialize `make` and `year`.

By completing this exercise, you will gain experience in implementing inheritance in Java with a real-world example and understand how subclass objects can utilize methods from both the superclass and the subclass. Happy coding!
