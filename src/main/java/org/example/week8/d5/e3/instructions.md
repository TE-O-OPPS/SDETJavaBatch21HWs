# Creating Methods with Different Access Modifiers

## Objective
Learn how to create methods with different access modifiers in Java and properly call them in the main method.

## Instructions

**Creating Methods with Different Access Modifiers**

In this project, you will create methods with the four different access modifiers: private, default, protected, and public. Each method will print a specific message indicating its access modifier. You will call each method from the main method, ensuring that the output is printed in a specific order.

### Steps for You to Do:

1. **Declare Methods with Access Modifiers:**
    - Create a method with a private access modifier that prints:
      ```
      This is Private Method
      ```
    - Create a method with a default access modifier that prints:
      ```
      This is Default Method
      ```
    - Create a method with a protected access modifier that prints:
      ```
      This is Protected Method
      ```
    - Create a method with a public access modifier that prints:
      ```
      This is Public Method
      ```

2. **Main Method:**
    - Inside the main method, call each method one by one in the following order:
        - Private Method
        - Default Method
        - Protected Method
        - Public Method

### Example InputOutput:

- Expected output:
  ```
  This is Private Method
  ```
  ```
  This is Default Method
  ```
  ```
  This is Protected Method
  ```
  ```
  This is Public Method
  ```

### Purpose:

- The exercise demonstrates how to use the four access modifiers (private, default, protected, and public) and how to call methods with different access levels from the main method.

## Tips:
- Ensure that the private method is called from within the same class, as it cannot be accessed outside of the class.
- Default access (package-private) methods can be accessed from within the same package.
- Protected methods can be accessed from subclasses and within the same package.
- Public methods can be accessed from anywhere.

## Troubleshooting:
- If you encounter access errors, ensure that you are calling the methods within the allowed access range based on their access modifier.
- Ensure that the methods are being called in the correct order in the main method.

By completing this exercise, you will better understand how access modifiers work in Java and how to properly use them. Happy coding!
