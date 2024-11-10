# String Method Practice: split()

## Objective
Practice using the split() method of the String class in Java to separate a string into an array of substrings based on a delimiter.

## Instructions

**Analyzing CSV Data**

In this exercise, you will work with a string representing a line from a CSV (Comma-Separated Values) file containing student information. You'll use the split() method to separate the data into individual fields and then analyze the information.

For you to do:

1. Declare a String variable named `csvLine` and assign it the value:
   "John Doe,22,Computer Science,3.8,2025"

2. Use the split() method to separate this string into an array of fields. The delimiter is a comma (",").

3. After splitting the string, extract the following information:
   - Student's full name
   - Student's age
   - Student's major
   - Student's GPA
   - Student's expected graduation year

4. Calculate and store the following:
   - The number of words in the student's full name
   - The length of the student's major (number of characters)

5. Print the extracted and calculated information in the following format:
   - Name: [full name]
   - Age: [age]
   - Major: [major]
   - GPA: [GPA]
   - Graduation Year: [year]
   - Name Word Count: [count]
   - Major Length: [length]

## Example Output
```
Name: John Doe
Age: 22
Major: Computer Science
GPA: 3.8
Graduation Year: 2025
Name Word Count: 2
Major Length: 16
```


## Tips

- The split() method returns an array of strings.
- You can specify the delimiter as an argument to split(). In this case, use split(",").
- To count words in a name, you can split it again using a space as the delimiter.
- Remember that array indices start at 0 in Java.

## Troubleshooting

- Make sure you're using the correct method name (split).
- Check that you're accessing the correct indices of the resulting array after splitting.
- Be careful with data types - you may need to convert strings to numbers for certain operations.

By completing this exercise, you'll practice using the split() method to parse structured data, simulating a real-world scenario of processing CSV data. This is a common task in data analysis, file processing, and working with exported data from spreadsheets or databases. Good luck!