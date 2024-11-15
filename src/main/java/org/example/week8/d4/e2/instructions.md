# Accessing Instance Variables

## Objective
Learn how to declare and access instance variables in Java by creating multiple instances of a class.

## Instructions

**Declaring and Accessing Instance Variables**

In this project, you will declare three instance variables and access them using two instances of a class.

**Steps to Follow:**


1. **Declare Instance Variables:**
    - Inside the E2Variables class, declare three instance variables:
        - An integer variable called age.
        - A double variable called price.
        - A char variable called letter.

2. **Create the Main Method:**
    - Inside the same class, create the `main` method.

3. **Instantiate the Class Twice:**
    - In the `main` method, create two objects (instances) of your class called obj1 and obj 2.

4. **Assign Values to the First Instance obj1 :**
    - For the first object obj1, assign the following values to the instance variables:
        - Integer variable age: `10`
        - Double variable price: `10.23`
        - Char variable letter: `'a'`

5. **Print Values of the First Instance:**
    - Print the values of the instance variables from the first object.

6. **Assign Values to the Second Instance obj2:**
    - For the second object, assign the following values to the instance variables:
        - Integer variable age: `100`
        - Double variable price: `100.23`
        - Char variable letter : `'s'`

8. **Print Values of the Second Instance:**
    - Print the values of the instance variables from the second object.

**Expected Output:**
```
10
10.23
a
100
100.23
s
```

## Tips
- Ensure your instance variables are properly declared within the class but outside any methods.
- When creating instances, use the `new` keyword followed by the class constructor.
- Access instance variables using the object reference (e.g., `obj1.variable`).
- Make sure to print each variable on a new line to match the expected output.

## Troubleshooting
- **Compilation Errors:**
    - Check for syntax errors like missing semicolons or incorrect variable types.
    - Ensure all variables and methods are correctly spelled and capitalized.

- **Incorrect Output:**
    - Verify that you are assigning the correct values to each instance's variables.
    - Make sure you're printing variables from the correct instance.

By following these steps, you'll understand how to declare and access instance variables in Java using multiple class instances. Happy coding!