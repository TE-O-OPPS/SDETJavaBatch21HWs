# Creating Methods with Different Access Modifiers in Another Class

## Objective
Learn how to declare methods with different access modifiers in a separate class and call them from the main class using the class name.

## Instructions

**Declaring Methods with Different Access Modifiers in Another Class**

In this project, you will declare methods with private, default, protected, and public access modifiers in a separate class called `AnotherClass`. Each method will return the name of the access modifier it is using. You will then call these methods from the main class using the class name.

### Steps for You to Do:

1. **Declare Methods with Access Modifiers:**
    - In `AnotherClass`, create the following methods:
        - A private method that returns `"private"`
        - A default (package-private) method that returns `"default"`
        - A protected method that returns `"protected"`
        - A public method that returns `"public"`

2. **Main Class:**
    - In the main class, call the methods of `AnotherClass` using the class name and print the results.
    - Note that only the default, protected, and public methods will be accessible due to access restrictions.

3. **Example InputOutput:**

- Expected output:
  ```
  default
  ```
  ```
  protected
  ```
  ```
  public
  ```

### Purpose:

- The exercise demonstrates how to use different access modifiers (private, default, protected, and public) in a separate class and access them from another class based on the allowed access levels.

## Tips:
- The private method will not be accessible from the main class due to its access level. Ensure that you handle this appropriately by calling only the accessible methods (default, protected, public).

## Troubleshooting:
- If you encounter access errors, ensure that you are correctly referencing the methods in the main class based on their access modifier.
- Ensure that the methods are called using the class name in a static context.

By completing this exercise, you will better understand how access modifiers control the visibility of methods across different classes in Java. Happy coding!
