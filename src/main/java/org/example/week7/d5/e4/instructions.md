# String Method Practice: `charAt()`

## Objective
Learn how to use the `charAt()` method of the `String` class in Java to access specific characters within a string.

## Instructions

**Validating a Product Code**

In this exercise, you will work with a product code and use the `charAt()` method to extract and analyze specific characters.

**For you to do:**

1. **Declare and Assign a String Variable**
    - Declare a `String` variable named `productCode` and assign it a value, for example, `"KX125"`.

2. **Use the `charAt()` Method to Analyze the Product Code**
    - Extract the first character of `productCode` using the `charAt()` method and store it in a variable named `firstChar`.
    - Check if the first character is the letter `'K'`.
    - Extract the last character of `productCode` and store it in a variable named `lastChar`.
    - Check if the last character is a digit `'5'`.

3. **Print the Results**
    - Print the results of your checks in the format:
        - `Product code starts with 'K': [true/false]`
        - `Product code ends with '5': [true/false]`

## Example

Assuming the `productCode` is `"KX125"`.

The output would be:

```
Product code starts with 'K': true
Product code ends with '5': true
```

## Tips

- Ensure your string variable is declared and assigned correctly.
- Remember that the `charAt(int index)` method returns a `char` at the specified index.
- In Java, string indices start at `0`.
- You can compare characters using the equality operator `==`, for example: `if (firstChar == 'K')`.
- To get the last character of a string, use `string.charAt(string.length() - 1)`.

## Troubleshooting

- **Compilation Errors**: Ensure that you're using the correct method names and that all variables are properly declared.
- **String Index Out of Bounds**: Make sure the indices you're accessing with `charAt()` are within the bounds of the string.
- **Incorrect Results**: Verify that you're using the correct indices and that your character comparisons are accurate.
- **Case Sensitivity**: Remember that character comparisons are case-sensitive.

By completing this exercise, you'll practice using the `charAt()` method to access and compare individual characters within a string in a real-life context. Happy coding!
