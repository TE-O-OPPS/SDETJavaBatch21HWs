# Creating and Calling Methods to Replace Characters in a String

## Objective
Learn how to create and call methods in Java to replace specific characters in a string.

## Instructions

**Creating and Calling Methods**

In this exercise, you will create a method that replaces all instances of a specified character with `*` in a string. You will then call this method from the `main` method to see how it works in practice.

**For you to do:**

1. **Define the `censorLetter` Method**
    - Write a method header with the following specifications:
        - **Returns:** `String`
        - **Name:** `censorLetter`
        - **Parameters:** a `String` and a `char`
    - Implement the `censorLetter` method to replace all instances of the specified character in the string with an asterisk (`*`).

   **Behavior:**
    - Iterate through the string and replace all occurrences of the given character with `*`.
    - Return the modified string.

   **Examples:**
   ```
   censorLetter("computer science", 'e') ==> "comput*r sci*nc*"
   censorLetter("trick or treat", 't') ==> "*rick or *rea*"
   ```

2. **Create the `E109JavaMethods` Class**
    - In a separate class named `E109JavaMethods`, within the `main` method, call the `censorLetter` method from the class where it's defined.
    - Pass different strings and characters to the `censorLetter` method and print the returned values to see the results.
3. **Understand Returning Methods**
    - **Methods in Java:** Methods allow you to organize reusable pieces of code. In this case, you will create a method that returns a `String` with specific characters replaced.
    - **Returning Methods:** Methods that return a value are useful when you need to perform transformations on data and pass the result back to the calling code.
    - **Why Return Values:** Returning values allows you to work with the result of the transformation and use it for display, further processing, or storage.

4. **Run Your Program**
    - Execute your program to see the output of the `censorLetter` method with different input strings and characters.

## Example Output
```
comput*r sci*nc*
*rick or *rea*
```

## Tips
- **Method Syntax:** Ensure your method is created with the correct syntax, including access modifiers, return type, method name, and parameters.
- **Character Replacement:** You can use either a loop or the `replace` method in Java to replace characters in the string.
- **String Manipulation:** Use `String` methods to iterate through the characters of the string or use built-in methods such as `replace()` to perform the replacement.
- **Method Accessibility:** Ensure that the `censorLetter` method is accessible from the `E109JavaMethods` class. Using the `public` access modifier allows other classes to call this method.

## Troubleshooting
- **Compilation Errors:**
    - **Missing Semicolons:** Ensure all statements end with a semicolon (`;`).
    - **Incorrect Method Declarations:** Verify that methods are declared with the correct syntax, including access modifiers, return types, and parameters.
    - **Class Accessibility Issues:** If classes are in different packages, ensure proper import statements are added.
- **No Output:**
    - **Method Calls:** Ensure that the `censorLetter` method is correctly called from the `main` method and that the returned value is printed.
    - **Print Statements:** Verify that the `censorLetter` method contains the correct `System.out.println` statements.
- **Incorrect Output:**
    - **Method Logic:** Ensure that the `censorLetter` method correctly replaces the specified character with `*` and returns the new string.
    - **Example Matching:** Confirm that the output matches the examples provided, with all instances of the specified character replaced.

By following these steps, you should be able to successfully create and call methods in Java that replace specific characters in a string. This exercise will help you understand method creation, returning values, and basic string manipulation in Java. Happy coding!
