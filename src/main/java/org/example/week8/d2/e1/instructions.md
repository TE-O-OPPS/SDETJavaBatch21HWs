# Creating and Calling Methods

## Objective
Learn how to create and call methods in Java to perform simple actions.

## Instructions

**Creating and Calling Methods**

In this exercise, you will create two simple methods in one class and call them from the `main` method of a different class. This will help you understand how methods work and why using `void` methods can be useful for performing actions without returning values.

**For you to do:**

1. **Create the `MethodLibrary` Class**
   - Create a new class named `MethodLibrary`.
   - Inside this class, create two methods: `greet` and `farewell`.
   - These methods should perform simple print operations to display messages.

2. **Create the `E1JavaMethods` Class**
   - Create another class named `E1JavaMethods`.
   - In this class, within the `main` method, call the `greet` and `farewell` methods from the `MethodLibrary` class.
   - Ensure that the methods are accessible from the `main` method by using appropriate access modifiers.

3. **Understand Void Methods**
   - Notice that the methods `greet` and `farewell` do not return any values. They are declared with the `void` keyword, which means they perform actions but do not provide any data back to the caller.
   - Using `void` methods is useful when you want to execute a sequence of statements, such as printing messages, without needing to return information.

4. **Run Your Program**
   - Execute your program to see the output of the `greet` and `farewell` methods being called from a different class.

## Example Output
```
Hello, welcome to Java!
Goodbye! Have a great day!
```

## Tips
- **Method Accessibility:** Ensure that the methods in the `MethodLibrary` class are accessible from the `E109JavaMethods` class. Using the `public` access modifier allows other classes to call these methods.
- **Static Methods:** Declaring methods as `static` allows them to be called without creating an instance of the `MethodLibrary` class.
- **Descriptive Method Names:** Choose method names that clearly describe their functionality to make your code more readable and maintainable.
- **Avoiding Code Duplication:** Methods help in reusing code and avoiding repetition, making your programs cleaner and easier to manage.

## Additional Information
- **Methods in Java:** Methods are blocks of code that perform specific tasks. They help in organizing code into reusable sections.
- **Void Keyword:** The `void` keyword indicates that a method does not return any value. It's useful for methods that perform actions like printing to the console or modifying object states.
- **Calling Methods from Other Classes:** To call a method from another class, ensure that the method is accessible (e.g., `public`) and, if static, can be called without creating an object instance.

## Troubleshooting
- **Compilation Errors:**
   - **Missing Semicolons:** Ensure all statements end with a semicolon (`;`).
   - **Incorrect Method Declarations:** Verify that methods are declared with the correct syntax, including access modifiers and return types.
   - **Class Accessibility Issues:** If classes are in different packages, ensure proper import statements are added.
- **No Output:**
   - **Method Calls:** Ensure that the `greet` and `farewell` methods are correctly called from the `main` method.
   - **Print Statements:** Verify that the methods contain the correct `System.out.println` statements.
- **Incorrect Output:**
   - **Print Statement Content:** Make sure the `greet` and `farewell` methods print the intended messages.
   - **Number of Calls:** Confirm that each method is called the intended number of times.

By following these steps, you should be able to successfully create and call methods in Java from different classes, enhancing your understanding of method usage and the benefits of using `void` methods for performing actions. Happy coding!
