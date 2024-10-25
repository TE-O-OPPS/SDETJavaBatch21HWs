# Working with 2D Arrays

## Objective
Learn how to declare, initialize, and access elements in 2D arrays in Java.

## Instructions

**Creating and Printing a 2D Array**

In this exercise, you will write a program that creates a simple 2D array (matrix) and prints its elements by directly accessing them using indices.

**For you to do:**

1. **Declare and Initialize the 2D Array**
   - Create a 2D array of integers with 3 rows and 3 columns.
   - Initialize the array with the following values:
     ```
     1 2 3
     4 5 6
     7 8 9
     ```

2. **Print the 2D Array Elements**
   - Use direct index access to print each element in the array.
   - Ensure that the output displays the array in matrix form, matching the expected output.

## Expected Output
```
1 2 3
4 5 6
7 8 9
```

## Tips
- **Declaring a 2D Array**: In Java, a 2D array is an array of arrays.
   - **Syntax**:
     ```java
     int[][] arrayName = new int[rows][columns];
     ```
- **Initializing a 2D Array**:
   - You can initialize a 2D array during declaration:
     ```java
     int[][] arrayName = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
     };
     ```
- **Accessing Elements in a 2D Array**:
   - You can access elements directly using their indices:
     ```java
     int value = arrayName[rowIndex][columnIndex];
     ```
- **Printing Elements**:
   - Remember to print a newline after each row to maintain the matrix format.
   - Use `System.out.print()` and `System.out.println()` methods appropriately.

## Additional Information
- **2D Arrays**: A 2D array can be visualized as a table with rows and columns.
- **Indexing**: Indices in arrays start from `0`. So the first row is `arrayName[0]`, and the first element in that row is `arrayName[0][0]`.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect array declarations.
- If the output is not as expected, ensure that you are accessing the correct indices in the array.

By following these steps, you should be able to successfully complete the exercise and understand how to work with 2D arrays in Java by accessing elements directly using indices. Happy coding!
