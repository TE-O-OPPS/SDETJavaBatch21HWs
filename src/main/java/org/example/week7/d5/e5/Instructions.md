# String Method Practice: charAt()

## Objective
Practice using the charAt() method of the String class in Java to validate a simple email address format.

## Instructions

**Validating a Basic Email Address**

In this exercise, you will work with an email address string and use the charAt() method to perform basic format validation.

For you to do:

1. Declare a String variable named `emailAddress` and assign it a value, for example, "user@example.com".

2. Extract the first character of `emailAddress` using the charAt() method and store it in a variable named `firstChar`.

3. Check if the first character is a letter. You can do this by checking if the character is between 'a' and 'z' (lowercase) or between 'A' and 'Z' (uppercase). Here's how:
    - Use the comparison operators `>=` and `<=` to check if `firstChar` is within these ranges.
    - For lowercase: `firstChar >= 'a' && firstChar <= 'z'`
    - For uppercase: `firstChar >= 'A' && firstChar <= 'Z'`
    - Combine these conditions using the OR operator (`||`).
    - Store the result in a boolean variable.

4. Extract the 5th character (index 4) of the email address using charAt() and store it in a variable named `fifthChar`.

5. Check if the 5th character is the '@' symbol by comparing `fifthChar` with '@'.

6. Print the results of your checks in the format:
    - Email starts with a letter: [true/false]
    - 5th character is @: [true/false]

## Example Output
```
Email starts with a letter: true
5th character is @: true
```


## Tips

- Remember that string indices start at 0 in Java.
- The charAt(int index) method returns the character at the specified index in a string.
- In Java, you can directly compare char values using comparison operators.
- The logical AND operator is `&&`, and the logical OR operator is `||`.

## Troubleshooting

- Make sure you're using the correct method name (charAt).
- Be careful with string indices to avoid "String Index Out of Bounds" errors.
- Pay attention to the case sensitivity when comparing characters.

By completing this exercise, you'll practice using the charAt() method to access and compare individual characters within a string in a real-life context of basic email validation. Good luck!