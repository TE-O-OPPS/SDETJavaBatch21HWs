# String Method Practice: replaceAll()

## Objective
Practice using the replaceAll() method of the String class in Java to perform more complex string replacements using regular expressions.

## Instructions

**Formatting a Phone Number**

In this exercise, you will work with strings representing phone numbers in various formats. You'll use the replaceAll() method to standardize these phone numbers into a consistent format.

For you to do:

1. Declare a String array named `phoneNumbers` and assign it the following values:
   {"(123) 456-7890", "987-654-3210", "555.444.3333", "444 333 2222", "12345678901"}

2. For each phone number in the array:
   a) Use replaceAll() to remove all non-digit characters (parentheses, spaces, dashes, dots).
   b) If the resulting number has exactly 10 digits, format it as "(XXX) XXX-XXXX".
   c) If the resulting number has more or less than 10 digits, leave it as is (just digits).

3. Print each original phone number and its formatted version in the following format:
   - Original: [original number], Formatted: [formatted number]

## Example Output
```
Original: (123) 456-7890, Formatted: (123) 456-7890
Original: 987-654-3210, Formatted: (987) 654-3210
Original: 555.444.3333, Formatted: (555) 444-3333
Original: 444 333 2222, Formatted: (444) 333-2222
Original: 12345678901, Formatted: 12345678901
```


## Tips

- The replaceAll() method uses regular expressions for pattern matching.
- To remove all non-digit characters, you can use the regex pattern "[^0-9]".
- To format the number, you can use String.format() or StringBuilder.
- Remember that replaceAll() returns a new string; it doesn't modify the original.

## Troubleshooting

- Make sure you're using the correct method name (replaceAll).
- Check your regex pattern carefully. Even small errors can lead to unexpected results.
- Test your code with various input formats to ensure it handles different cases correctly.

By completing this exercise, you'll practice using the replaceAll() method with regular expressions to standardize phone number formats. This is a common task in data cleaning and formatting, often encountered in real-world applications dealing with user input or data integration. Good luck!