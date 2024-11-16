# Creating and Using a Dog Class with Instance and Static Variables

## Objective
Learn how to define and use instance variables, static variables, and constructors in a Java class. You will practice creating multiple objects and using them to display their details, demonstrating the difference between instance and static variables.

## Instructions

**Step 1: Define Class Variables in Dog Class**

1. **Create the `Dog.java` class** and define the following variables:
    - `dogName`: An instance variable that stores the name of the dog. (String)
    - `dogWeight`: An instance variable that stores the weight of the dog. (double)
    - `static dogBreed = "Mutt";`: A static variable that stores the breed of the dog, defaulting to `"Mutt"`. (String)

   **Note:** Use proper naming conventions for all variables. The instance variables should be defined as `private` to ensure encapsulation.

**Step 2: Implement the Constructor**

1. **Create a constructor** in the `Dog` class that accepts two parameters:
    - `dogName`: The name of the dog.
    - `dogWeight`: The weight of the dog.

2. The constructor should initialize the instance variables (`dogName` and `dogWeight`) using the values passed as arguments.

   **Example Constructor Implementation (Explanation):**
    - The constructor should take the name and weight of the dog as input.
    - It should set the corresponding instance variables (`dogName` and `dogWeight`) with these values.

**Step 3: Create a Method to Display Dog Details**

1. **Create a method called `displayDetails`** in the `Dog` class that prints the values of the `dogName`, `dogBreed`, and `dogWeight` variables in a single line, separated by spaces.

   **Output Format (Explanation):**
    - The method should concatenate the dog's name, breed, and weight into a single string, and print this string to the console.
    - The output should look like: `DogName DogBreed DogWeight`. For example, "Tarzan Mutt 50.0".

**Step 4: Test the Dog Class in the Main Class**

1. **In the `Main` class:**
    - Create two objects of the `Dog` class, initializing each with different values for `dogName` and `dogWeight`.
    - Use the method created in Step 3 to print the details of each `Dog` object.

   **Example Steps (Explanation):**
    - Create an object of the `Dog` class for a dog named "Tarzan" with a weight of 50.0.
    - Create another object of the `Dog` class for a dog named "Lucy" with a weight of 10.0.
    - Call the method that displays the details of each dog, and ensure the output is formatted correctly as described above.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

### Example Output:

- When you run your program, you should see the following output:

  ```
  Tarzan Mutt 50.0
  Lucy Mutt 10.0
  ```

## Tips:

- **Static Variable:** Remember that `dogBreed` is a static variable, meaning it is shared among all instances of the `Dog` class. All dogs will have the same breed (`"Mutt"` in this case).
- **Encapsulation:** Ensure that `dogName` and `dogWeight` are instance variables specific to each dog object and set within the constructor.
- **Method Naming:** Follow Java naming conventions, using camelCase for method names (e.g., `displayDetails`).

By completing this exercise, you will gain a better understanding of how to work with instance variables, static variables, and constructors in Java. Happy coding!
