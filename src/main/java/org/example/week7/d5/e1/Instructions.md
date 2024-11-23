# Exercise: Using the `isEmpty()` Method in Java Strings

## Objective
Learn how to use the `isEmpty()` method of the `String` class in Java to check if a string is empty.

## Instructions

**Check if Strings are Empty Using the `isEmpty()` Method**

In this exercise, you will create string variables and use the `isEmpty()` method to determine if they are empty.

**For you to do:**

1. **Create String Variables**
    - Create a `String` variable named `s1` and assign the value `"Hello"` to it.
    - Create a `String` variable named `s2` and assign an empty string `""` to it.
    - Create a `String` variable named `s3` and assign the value `"   "` (a string with three spaces) to it.

2. **Check if the Strings are Empty**
    - Use the `isEmpty()` method to check if `s1` is empty, and store the result in a `boolean` variable `isEmpty1`.
    - Use the `isEmpty()` method to check if `s2` is empty, and store the result in a `boolean` variable `isEmpty2`.
    - Use the `isEmpty()` method to check if `s3` is empty, and store the result in a `boolean` variable `isEmpty3`.

3. **Print the Results**
    - Print the results of each check in the format:
        - `Is s1 empty? [result]`
        - `Is s2 empty? [result]`
        - `Is s3 empty? [result]`

## Expected Output
```
Is s1 empty? false
Is s2 empty? true
Is s3 empty? false
```

## Tips
- Ensure your string variables are declared and assigned correctly.
- Remember that the `isEmpty()` method returns `true` if the string's length is `0`.
- A string containing whitespace characters (like spaces) is **not** considered empty.
- Use the correct syntax for calling the `isEmpty()` method: `string.isEmpty()`.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the strings are assigned the correct values and that you're using the `isEmpty()` method correctly.
- Remember that `isEmpty()` checks for strings of length `0`. It does not consider strings containing only whitespace as empty.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `isEmpty()` method in Java to check if strings are empty. Happy coding!
