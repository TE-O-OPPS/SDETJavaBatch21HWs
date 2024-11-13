# StringBuilder Method Practice: delete()

## Objective
Practice using the delete() method of the StringBuilder class in Java to remove portions of a string efficiently.

## Instructions

**Cleaning Up Product Codes**

In this exercise, you will create a program that cleans up product codes by removing unnecessary characters. You'll use StringBuilder and its delete() method to efficiently manipulate the strings.

For you to do:

1. Declare a String array named `productCodes` and assign it the following values:
   {"ABC-123-XYZ", "PQR-456-789-UVW", "XXX---111", "555-ZZZ-", "-999-YYY"}

2. For each product code in the array:
   a) Create a StringBuilder object with the product code.
   b) Use the delete() method to remove all hyphens ('-') from the string.
   c) If the resulting string is longer than 9 characters, use delete() to remove all characters after the 9th position.
   d) If the resulting string is shorter than 9 characters, do not modify it further.

3. Print each original product code and its cleaned version in the following format:
   - Original: [original code], Cleaned: [cleaned code]

## Example Output
```
Original: ABC-123-XYZ, Cleaned: ABC123XYZ
Original: PQR-456-789-UVW, Cleaned: PQR456789
Original: XXX---111, Cleaned: XXX111
Original: 555-ZZZ-, Cleaned: 555ZZZ
Original: -999-YYY, Cleaned: 999YYY
```


## Tips

- The delete() method removes characters from the StringBuilder in a specified range.
- You can use a loop with indexOf() to find and remove all occurrences of a character.
- Remember that StringBuilder modifies the string in place, which is efficient for multiple operations.

## Troubleshooting

- Make sure you're using the correct method name (delete).
- Be careful with the indices when deleting - remember that string indices start at 0.
- After deleting characters, the indices of the remaining characters may shift. Consider this when making multiple deletions.

By completing this exercise, you'll practice using the StringBuilder delete() method to clean up strings, simulating a real-world scenario of data cleaning and standardization. This task demonstrates the efficiency of StringBuilder for removing unwanted portions of strings, which is often needed in data processing tasks. Good luck!