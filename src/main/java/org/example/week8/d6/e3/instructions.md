# Implementing a Product Class with Constructors and Display Method

## Objective
Learn how to create a Java class with instance variables, multiple constructors, and a method to display the object's state. You'll practice using different constructors to initialize objects with varying levels of detail.

## Instructions

**Step 1: Define Instance Variables in StoreProduct Class**

1. Create the `StoreProduct.java` class and define the following instance variables:
    - `label`: The name of the product.
    - `price`: The price of the product.
    - `category`: The category the product belongs to (e.g., Produce, Dairy, etc.).
    - `hasExpiration`: A boolean indicating whether the product has an expiration date.
    - `stock`: An integer representing the quantity of the product in stock.

Ensure proper data types and naming conventions are used for each variable.

**Step 2: Implement Constructors**

1. **Main Constructor:**
    - Create a constructor that accepts values for all instance variables (`label`, `price`, `category`, `hasExpiration`, `stock`).

2. **Second Constructor:**
    - Create a constructor that accepts all instance variables except `category` and `hasExpiration`.
    - Inside this constructor, set `category` to `"misc"` and `hasExpiration` to `false` by default.

3. **Third Constructor:**
    - Create a constructor that accepts all instance variables except `category`, `hasExpiration`, and `stock`.
    - Inside this constructor, set `category` to `"misc"`, `hasExpiration` to `false`, and `stock` to `0` by default.

**Step 3: Create a Display Method**

1. In the `StoreProduct` class, create a method called `display` that prints out the values of all instance variables in the following order: `label`, `price`, `category`, `hasExpiration`, `stock`.
2. Ensure the output is on a single line, with values separated by spaces.

**Step 4: Test the Class with Different Constructors**

1. In the `Main` class:
    - Create an object of the `StoreProduct` class using each of the three constructors.
    - Pass appropriate values when creating these objects.
    - Call the `display` method on each object to print their details.

**Step 5: Run Your Application**

1. Execute your program to see the output of each `StoreProduct` object created using the different constructors.

### Example Output:

- When the program runs, you should see the following output:

  ```
  Eggs 3.0 Produce true 10
  Paper Towels 2.0 misc false 24
  Paper Towels 2.0 misc false 0
  ```

## Hints:

- Ensure that each variable is specific to the object (i.e., instance variables).
- Pay attention to the order of output in the `display` method to match the example provided.
- Default values in the constructors should be set within the constructors themselves, not through method calls or initializers outside the constructors.

By completing this exercise, you will gain experience in working with constructors, instance variables, and methods in Java, and understand how to initialize objects in different ways. Happy coding!
