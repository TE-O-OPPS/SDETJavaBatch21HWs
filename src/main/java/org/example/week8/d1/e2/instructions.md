# StringBuilder Method Practice: insert()

## Objective
Practice using the insert() method of the StringBuilder class in Java to add content at specific positions within a string.

## Instructions

**Creating a Time Stamp Formatter**

In this exercise, you will create a program that formats a basic time string by inserting colons and adding AM/PM indicator. You'll use StringBuilder and its insert() method to efficiently manipulate the string.

For you to do:

1. Declare a String array named `timeStrings` and assign it the following values:
   {"1200", "0930", "1545", "0000", "2359"}

2. For each time string in the array:
   a) Create a StringBuilder object with the time string.
   b) Use the insert() method to add a colon (':') between the hours and minutes (at index 2).
   c) Determine if the time is AM or PM:
   - Times from 0000 to 1159 are AM
   - 1200 is PM
   - Times from 1201 to 2359 are PM
     d) Use the insert() method to add a space and "AM" or "PM" at the end of the string.
     e) If the time is "00:00 AM", change it to "12:00 AM".
     f) If the time is "12:00 PM", keep it as is.
     g) For PM times after 12:59, subtract 12 from the hours.

3. Print each original time string and its formatted version in the following format:
   - Original: [original time], Formatted: [formatted time]

## Example Output
```
Original: 1200, Formatted: 12:00 PM
Original: 0930, Formatted: 09:30 AM
Original: 1545, Formatted: 03:45 PM
Original: 0000, Formatted: 12:00 AM
Original: 2359, Formatted: 11:59 PM
```


## Tips

- The insert() method allows you to add content at a specific index in the StringBuilder.
- You can convert the StringBuilder back to a String using toString() when needed for comparisons.
- Remember that StringBuilder modifies the string in place, which is efficient for multiple operations.

## Troubleshooting

- Make sure you're using the correct method name (insert).
- Be careful with the indices when inserting - remember that string indices start at 0.
- Pay attention to the time conversion rules, especially for midnight and noon.

By completing this exercise, you'll practice using the StringBuilder insert() method to format time strings, simulating a real-world scenario of data formatting. This task demonstrates the flexibility of StringBuilder for inserting content at specific positions, which is often needed in string manipulation tasks. Good luck!