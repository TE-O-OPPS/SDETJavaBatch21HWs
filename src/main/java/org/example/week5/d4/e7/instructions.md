# Skipping Out-of-Stock Items Using Continue

## Objective
Learn how to use the `continue` keyword in Java loops in a real-life scenario.

## Instructions

**Skipping Out-of-Stock Items**

In this **exercise**, you will write a program that simulates processing a list of items in an inventory. You will use an enhanced `for` loop to iterate through an array of items and use the `continue` keyword to skip items that are out of stock.

**For you to do:**

1. **Declare and Initialize the Array**
   - Create an array of strings representing items in inventory: `{"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `continue` Keyword**
   - Inside the loop, use an `if` statement to check if the current item is `"Out of Stock"`.
   - If it is, use the `continue` keyword to skip the current iteration.

4. **Process the Current Item**
   - For each item that is not out of stock, print `"Processing [ItemName]"`.

## Expected Output
```
Processing Item1
Processing Item2
Processing Item3
Processing Item4
```

## Tips
- **String Comparison**: Use the `.equals()` method to compare strings in Java.
- **Using the Enhanced For Loop in Java**: Simplifies the traversal of arrays and collections.
- **Understanding the `continue` Keyword in Loops**: The `continue` statement skips the current iteration and moves to the next one.
- Ensure your `if` condition correctly identifies out-of-stock items to skip them.

## Additional Information
- **Array**: An array is a container object that holds a fixed number of values of a single type.
- **Enhanced For Loop**: Simplifies the traversal of arrays and collections.
- **Continue Keyword**: Controls the flow of loops by skipping the current iteration when a certain condition is met.
- **String Comparison**: In Java, use `.equals()` to compare strings for equality.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect loop syntax.
- If the output is not as expected, ensure that your `if` condition and the placement of `continue` are correct.
- Make sure you're correctly identifying out-of-stock items to skip them.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `continue` keyword in Java loops in a real-life context. Happy coding!
