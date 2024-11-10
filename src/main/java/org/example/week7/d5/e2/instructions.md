# Using the `trim()` Method in Java Strings

## Objective
Learn how to use the `trim()` method of the `String` class in Java to remove leading and trailing whitespace from strings.

## Instructions

**Trim Whitespace from Strings**

In this exercise, you will create strings with leading and trailing whitespace and use the `trim()` method to remove it.

**For you to do:**

1. **Create String Variables**
   - Create a `String` variable named `str1` and assign the value `"   Learn Java   "` to it (note the spaces before and after the text).
   - Create a `String` variable named `str2` and assign the value `"\tPractice Makes Perfect\t"` to it (note the tab characters `\t` before and after the text).

2. **Trim the Strings**
   - Use the `trim()` method to remove the leading and trailing whitespace from `str1` and `str2`.
   - Assign the trimmed results to new variables `trimmedStr1` and `trimmedStr2`.

3. **Print the Results**
   - Print the original and trimmed values of `str1` and `str2` using the following format:
      - `Original str1: '[original_str1]'`
      - `Trimmed str1: '[trimmedStr1]'`
      - `Original str2: '[original_str2]'`
      - `Trimmed str2: '[trimmedStr2]'`

## Example Output
```
Original str1: '   Learn Java   '
Trimmed str1: 'Learn Java'
Original str2: '	Practice Makes Perfect	'
Trimmed str2: 'Practice Makes Perfect'
```

## Tips
- Ensure your string variables are declared and assigned correctly.
- Remember to use the correct syntax for calling the `trim()` method: `str.trim()`.
- When printing, use single quotes around the strings to make the whitespace visible.
- The `trim()` method removes leading and trailing whitespace characters, including spaces and tabs.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the string variables are assigned the correct values with the intended whitespace.
- Make sure you're applying the `trim()` method correctly and printing both the original and trimmed strings.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `trim()` method in Java to remove whitespace from strings. Happy coding!
