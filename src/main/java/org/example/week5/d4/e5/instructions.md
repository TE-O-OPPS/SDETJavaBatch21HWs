# Processing Orders with Break in Loops

## Objective
Learn how to use the `break` keyword in Java loops in a real-life scenario.

## Instructions

**Processing Orders Until a Defective Item is Found**

In this project, you will write a program that simulates processing a batch of items on a production line. You will use an enhanced `for` loop to iterate through an array of items and use the `break` keyword to stop processing when a defective item is found.

**For you to do:**

1. **Declare and Initialize the Array**
   - Create an array of strings representing items on a production line: `{"Item1", "Item2", "Defective", "Item3", "Item4"}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `break` Keyword**
   - Inside the loop, use an `if` statement to check if the current item is `"Defective"`.
   - If it is, print a message `"Defective item found. Stopping the production line."` and use the `break` keyword to exit the loop.

4. **Process the Current Item**
   - If the item is not defective, print `"Processing [ItemName]"`.

## Expected Output
```
Processing Item1
Processing Item2
Defective item found. Stopping the production line.
```

## Tips
- **String Comparison**: Use the `.equals()` method to compare strings in Java.
- **Using the Enhanced For Loop in Java**: Simplifies the traversal of arrays and collections.
- **Understanding the `break` Keyword in Loops**: The `break` statement exits the loop immediately.
- Ensure that the message about the defective item is printed before breaking out of the loop.

## Additional Information
- **Array**: An array is a container object that holds a fixed number of values of a single type.
- **Enhanced For Loop**: An enhanced `for` loop simplifies the traversal of arrays and collections.
- **Break Keyword**: Controls the flow of loops by exiting them when a certain condition is met.
- **String Comparison**: In Java, use `.equals()` to compare strings for equality.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect loop syntax.
- If the output is not as expected, ensure that your `if` condition correctly identifies the defective item and that the `break` statement is placed appropriately.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `break` keyword in Java loops in a real-life context. Happy coding!
