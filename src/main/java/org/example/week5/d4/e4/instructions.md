# Monitoring Temperature Levels with Break in Loops

## Objective
Learn how to use the `break` keyword in Java loops in a real-life scenario.

## Instructions

**Monitoring Temperature Levels**

In this project, you will write a program that simulates monitoring temperature readings from a sensor. You will use an enhanced `for` loop to iterate through an array of temperature readings and use the `break` keyword to stop the monitoring when a critical temperature is reached.

**For you to do:**

1. **Declare and Initialize the Array**
   - Create an array of doubles representing temperature readings in degrees Celsius: `{36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `break` Keyword**
   - Inside the loop, use an `if` statement to check if the current temperature is greater than or equal to `39.5`.
   - If it is, print a message `"Critical temperature reached: [Temperature]°C. Stopping monitoring."` and use the `break` keyword to exit the loop.

4. **Print the Current Temperature**
   - For each temperature before the break condition is met, print `"Temperature is normal: [Temperature]°C"`.

## Expected Output
```
Temperature is normal: 36.5°C
Temperature is normal: 37.0°C
Temperature is normal: 37.5°C
Temperature is normal: 38.0°C
Critical temperature reached: 39.5°C. Stopping monitoring.
```

## Tips
- **Using the Enhanced For Loop in Java**: Simplifies the traversal of arrays and collections.
- **Understanding the `break` Keyword in Loops**: The `break` statement exits the loop immediately.
- Be mindful of the condition in your `if` statement to ensure the correct temperatures trigger the `break`.
- **String Concatenation**: Use the `+` operator to combine strings and variables when printing.

## Additional Information
- **Array**: An array is a container object that holds a fixed number of values of a single type.
- **Enhanced For Loop**: An enhanced `for` loop simplifies the traversal of arrays and collections.
- **Break Keyword**: Controls the flow of loops by exiting them when a certain condition is met.
- **String Concatenation**: In Java, you can combine strings and variables using the `+` operator.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect loop syntax.
- If the output is not as expected, ensure that your `if` condition and the placement of `break` are correct.
- Make sure you're concatenating strings and variables correctly in your `System.out.println()` statements.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `break` keyword in Java loops in a real-life context. Happy coding!
