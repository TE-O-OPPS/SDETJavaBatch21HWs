# Implementing a ShoppingStore Class with Total Price Calculation

## Objective
Learn how to create a Java class with instance variables, constructors, and methods to calculate and return the total price of items. You will also practice using these methods to sum values from multiple objects.

## Instructions

**Step 1: Define Instance Variables in ShoppingStore Class**

1. **Create the `ShoppingStore.java` class** and define the following instance variables:
    - `item`: Stores the name of the item. (String)
    - `price`: Stores the price of a single item. (double)
    - `quantity`: Stores the quantity of the item in stock. (int)

   **Note:** Use proper naming conventions for all variables. The instance variables should be defined as `private` to ensure encapsulation.

**Step 2: Implement the Constructor**

1. **Create a constructor** in the `ShoppingStore` class that accepts three parameters:
    - `item`: The name of the item.
    - `price`: The price of a single item.
    - `quantity`: The number of items in stock.

2. The constructor should initialize the instance variables using the values passed as arguments.

   **Example Constructor Implementation (Explanation):**
    - The constructor should take the item name, price, and quantity as input.
    - It should set the corresponding instance variables (`item`, `price`, and `quantity`) with these values.

**Step 3: Create a Method to Calculate and Display Item Total Price**

1. **Create a method called `itemTotalPrice`** in the `ShoppingStore` class that calculates the total price of the items in stock and prints the result.

   **Logic (Explanation):**
    - Multiply the `price` by the `quantity` to get the total value for that item.
    - Print the result in the following format: `"Item Total Value TotalValue"`.
    - Return the calculated total value so it can be used in further calculations.

   **Example Output Format:**
    - If the item is "Blanket", the total value should be printed as `"Blanket Total Value 99.98"`.

**Step 4: Test the ShoppingStore Class in the Main Class**

1. **In the `Main` class:**
    - Create two objects of the `ShoppingStore` class with different items, prices, and quantities.
    - Call the `itemTotalPrice` method on each object to calculate and print the total price for each item.
    - Store the returned value from each `itemTotalPrice` method call.

   **Example Steps (Explanation):**
    - Create an object of the `ShoppingStore` class for an item "Blanket" with a price of 49.99 and a quantity of 2.
    - Create another object of the `ShoppingStore` class for an item "Mattress" with a price of 219.59 and a quantity of 2.
    - Call the method that calculates and prints the total price for each item.
    - Store the returned total values from these method calls for further use.

**Step 5: Calculate and Display the Total Sum of Purchases**

1. **In the `Main` class:**
    - Add the returned values of both items to calculate the total sum of purchases.
    - Print the result in the following format: `"You purchased TotalSum Today"`.

   **Example Output Format:**
    - If the total sum is 539.16, the output should be `"You purchased 539.16 Today"`.

**Step 6: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

### Example Output:

- When you run your program, you should see the following output:

  ```
  Blanket Total Value 99.98
  Mattress Total Value 439.18
  You purchased 539.16 Today
  ```

## Tips:

- **Return Values:** Ensure that the `itemTotalPrice` method returns the calculated total so it can be used in the `Main` class for summing up the total purchases.
- **Encapsulation:** Keep instance variables private and provide access to them through the constructor and methods.
- **Method Naming:** Follow Java naming conventions, using camelCase for method names (e.g., `itemTotalPrice`).

By completing this exercise, you will gain experience in working with instance variables, constructors, methods, and arithmetic operations in Java. Happy coding!
