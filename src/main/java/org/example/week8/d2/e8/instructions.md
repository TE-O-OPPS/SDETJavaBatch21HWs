# Creating and Calling Methods

## Objective
Learn how to create and call methods in Java to manipulate strings by inserting spaces between characters.

## Instructions

**Creating and Calling Methods**

In this exercise, you will create a method that processes a string by inserting spaces between each character and then call this method from the `main` method in a different class. This will help you understand how methods work, how to return values from methods, and how to call methods from other classes.

**For you to do:**

1. **Define the `spaceOut` Method**
    - Create a method with the following specifications:
        - **Returns:** `String`
        - **Name:** `spaceOut`
        - **Parameters:** a single `String` parameter named `s`
    - Implement the `spaceOut` method to insert spaces after every character in the input string and return the new string.

   **Behavior:**
    - Iterate through each character of the input string.
    - After each character, insert a space.
    - Ensure that the final string has a space at the end.

   **Example:**
    ```
    spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y "
    ```

2. **Create the `E109JavaMethods` Class**
    - In a separate class named `E109JavaMethods`, within the `main` method, call the `spaceOut` method from the class where it's defined.
    - Pass different strings to the `spaceOut` method and print the returned values to see the results.

3. **Understand Returning Methods**
    - **Methods in Java:** Methods are blocks of code that perform specific tasks and can return values. They help in organizing code into reusable sections.
    - **Returning Methods:** Methods that return a value provide data back to the caller. This is useful when you need to perform computations or transformations and use the result elsewhere in your program.
    - **Why Return Values:** Returning values from methods allows you to capture the result of operations and use them for further processing, display, or storage.

4. **Run Your Program**
    - Execute your program to see the output of the `spaceOut` method with different input strings.

## Example Output
```
h e l l o
t e c h n o l o g y
```

## Tips
- **Method Syntax:** Ensure your method is created with the correct syntax, including access modifiers, return type, method name, and parameters.
- **Loop Usage:** Use a loop inside the `spaceOut` method to iterate through each character of the string and insert spaces.
- **String Concatenation:** Use `String` concatenation or `StringBuilder` to build the new string with spaces.
- **Method Accessibility:** Ensure that the `spaceOut` method is accessible from the `E109JavaMethods` class. Using the `public` access modifier allows other classes to call this method.
- **Descriptive Method Names:** Choose method names that clearly describe their functionality to make your code more readable and maintainable.

## Troubleshooting
- **Compilation Errors:**
    - **Missing Semicolons:** Ensure all statements end with a semicolon (`;`).
    - **Incorrect Method Declarations:** Verify that methods are declared with the correct syntax, including access modifiers, return types, and parameters.
    - **Class Accessibility Issues:** If classes are in different packages, ensure proper import statements are added.
- **No Output:**
    - **Method Calls:** Ensure that the `spaceOut` method is correctly called from the `main` method and that the returned value is printed.
    - **Print Statements:** Verify that the `spaceOut` method contains the correct `System.out.println` statements.
- **Incorrect Output:**
    - **Method Logic:** Ensure that the `spaceOut` method correctly inserts spaces after each character and returns the new string.
    - **Example Matching:** Confirm that the output matches the examples provided, including the space at the end of the string.

By following these steps, you should be able to successfully create and call methods in Java that manipulate strings by inserting spaces between characters. This exercise will enhance your understanding of method creation, returning values, and method invocation from different classes. Happy coding!
