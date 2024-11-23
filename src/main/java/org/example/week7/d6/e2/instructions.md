# String Method Practice: substring()

## Objective
Practice using the substring() method of the String class in Java to extract meaningful information from a formatted text string.

## Instructions

**Parsing a Log Entry**

In this exercise, you will work with a log entry string from a hypothetical server log. You'll use the substring() method to extract various pieces of information from this log entry.

For you to do:

1. Declare a String variable named `logEntry` and assign it the value:
   "2023-03-15 09:42:17 INFO [UserService] User 'jsmith' logged in from IP 192.168.1.101"

2. Extract the date (2023-03-15) from the log entry using the substring() method.

3. Extract the time (09:42:17) from the log entry.

4. Extract the log level (INFO) from the log entry.

5. Extract the service name (UserService) from the log entry. Note: It's enclosed in square brackets.

6. Extract the username (jsmith) from the log entry. Note: It's enclosed in single quotes.

7. Extract the IP address (192.168.1.101) from the log entry.

8. Print the extracted information in the following format:
    - Date: [extracted date]
    - Time: [extracted time]
    - Log Level: [extracted log level]
    - Service: [extracted service name]
    - User: [extracted username]
    - IP Address: [extracted IP address]

## Example Output
```
Date: 2023-03-15
Time: 09:42:17
Log Level: INFO
Service: UserService
User: jsmith
IP Address: 192.168.1.101

```

## Tips

- The substring() method can be used with one argument (startIndex) or two arguments (startIndex, endIndex).
- When using two arguments, the character at endIndex is not included in the result.
- You can use the indexOf() method to find the positions of specific characters or substrings.
- Remember that string indices start at 0 in Java.

## Troubleshooting

- Make sure you're using the correct method name (substring).
- Be careful with the indices you use in substring() calls to avoid StringIndexOutOfBoundsException.
- Pay attention to the exact format of the log entry, including spaces and special characters.

By completing this exercise, you'll practice using the substring() method to extract meaningful information from a formatted string, simulating a real-world scenario of parsing log entries. Good luck!