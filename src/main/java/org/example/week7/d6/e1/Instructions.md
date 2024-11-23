# String Method Practice: substring()

## Objective
Practice using the substring() method of the String class in Java to extract portions of a string.

## Instructions

**Extracting Information from a Data String**

In this exercise, you will work with a data string containing various pieces of information and use the substring() method to extract specific parts.

For you to do:

1. Declare a String variable named `dataString` and assign it the value: "ID:12345-NAME:John Doe-AGE:30-CITY:New York"

2. Use the substring() method to extract the ID (12345) from the dataString. Hint: Find the position of "ID:" and "NAME:" using indexOf method.

3. Use the substring() method to extract the full name (John Doe) from the dataString.

4. Use the substring() method to extract the age (30) from the dataString.

5. Use the substring() method to extract everything from the CITY field to the end of the string.

6. Print the results of your extractions in the format:
   - ID: [extracted ID]
   - Name: [extracted name]
   - Age: [extracted age]
   - City Info: [extracted city info]

## Example Output
```
ID: 12345
Name: John Doe
Age: 30
City Info: CITY:New York
```


## Tips

- The substring() method can be used with one argument (startIndex) or two arguments (startIndex, endIndex).
- When using two arguments, the character at endIndex is not included in the result.
- You can use the indexOf() method to find the positions of the separators in the string.
- Remember that string indices start at 0 in Java.

## Troubleshooting

- Make sure you're using the correct method name (substring).
- Be careful with the indices you use in substring() calls to avoid StringIndexOutOfBoundsException.
- Check that you're correctly handling the case where a field might be at the end of the string.

By completing this exercise, you'll practice using the substring() method to extract specific portions of a string based on known patterns. Good luck!