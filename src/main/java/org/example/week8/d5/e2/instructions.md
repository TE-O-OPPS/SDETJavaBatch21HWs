# Mixing Two Strings with Static Methods

## Objective
Learn how to create and execute a static method in Java that combines two strings, one letter at a time.

## Instructions

**Mixing Two Strings with a Static Method**

In this project, you will create a static method that combines two equal-length strings by alternating their characters.

### Steps for You to Do:

1. **Create the Static Method:**
    - Define a static method called `mixString`.
    - The method should have the following specification:
        - **Return Type:** `String`
        - **Method Name:** `mixString`
        - **Parameters:**
            - A `String` called `s1`
            - A `String` called `s2`
    - Inside the method, write logic to combine the strings by alternating their characters, starting with `s1`.

### Example:

Suppose `s1 = "12345"` and `s2 = "abcde"`, calling `mixString(s1, s2)` should return the string `"1a2b3c4d5e"`.

### Code Snippet:
```java
public static String mixString(String s1, String s2) {
 Your logic here to combine strings character by character
}
```

### Input Constraints:
- Both strings should be of **equal lengths**.

### Example InputOutput:

- `1a2b3c4d5e`

## Tips:
- Make sure the strings are of equal length before processing.
- Loop through each character of both strings to alternate between them.

## Troubleshooting:
- If the program doesn't return the expected result, check for logic errors in the loop that processes the strings.
- Ensure that the method is declared as `static` and is properly invoked.

By completing this exercise, you will gain a better understanding of how to create static methods and manipulate strings in Java. Happy coding!
