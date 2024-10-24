# Filtering Sensor Readings Using Continue

## Objective
Learn how to use the `continue` keyword in Java loops in a real-life scenario.

## Instructions

**Filtering Sensor Readings**

In this exercise, you will write a program that simulates processing a list of sensor readings. You will use an enhanced `for` loop to iterate through an array of readings and use the `continue` keyword to skip invalid readings (e.g., negative values).

**For you to do:**

1. **Declare and Initialize the Array**
   - Create an array of doubles representing sensor readings: `{15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `continue` Keyword**
   - Inside the loop, use an `if` statement to check if the current reading is negative.
   - If it is, use the `continue` keyword to skip the current iteration.

4. **Process the Valid Reading**
   - For each valid (non-negative) reading, print `"Valid reading: [Reading] units"`.

## Expected Output
```
Valid reading: 15.5 units
Valid reading: 20.0 units
Valid reading: 22.5 units
Valid reading: 18.0 units
Valid reading: 21.5 units
```

## Tips
- **Using the Enhanced For Loop in Java**: Simplifies the traversal of arrays and collections.
- **Understanding the `continue` Keyword in Loops**: The `continue` statement skips the current iteration and moves to the next one.
- Ensure your `if` condition correctly identifies negative readings to skip them.
- Use string concatenation to include the reading value in your output.

## Additional Information
- **Array**: An array is a container object that holds a fixed number of values of a single type.
- **Enhanced For Loop**: Simplifies the traversal of arrays and collections.
- **Continue Keyword**: Controls the flow of loops by skipping the current iteration when a certain condition is met.
- **Condition Checking**: Use relational operators like `<` or `>=` to compare numerical values.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect loop syntax.
- If the output is not as expected, ensure that your `if` condition and the placement of `continue` are correct.
- Make sure you're correctly identifying negative readings to skip them.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `continue` keyword in Java loops in a real-life context. Happy coding!
