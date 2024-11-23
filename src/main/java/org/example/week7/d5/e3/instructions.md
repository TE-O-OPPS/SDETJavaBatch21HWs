# Real-Life String Methods Practice: startsWith, contains, endsWith

## Objective
Learn how to use the `startsWith`, `contains`, and `endsWith` methods of the `String` class in Java to perform common string checks in real-life scenarios.

## Instructions

**Processing an Email Address**

In this exercise, you will work with an email address and use string methods to validate and extract information from it.

**For you to do:**

1. **Declare and Assign a String Variable**
    - Declare a `String` variable named `email` and assign it an email address of your choice (e.g., `"john.doe@example.com"`).

2. **Use String Methods to Analyze the Email Address**
    - Use the `contains()` method to check if the email address contains the `"@"` symbol.
    - Use the `startsWith()` method to check if the email address starts with `"info"`.
    - Use the `endsWith()` method to check if the email address ends with `".com"`.

3. **Print the Results**
    - Print the results of each check in the format:
        - `Contains '@'? [result]`
        - `Starts with 'info'? [result]`
        - `Ends with '.com'? [result]`

## Example

Assuming the email address is `"john.doe@example.com"`.

The output would be:

```
Contains '@'? true
Starts with 'info'? false
Ends with '.com'? true
```

## Tips
- Ensure your string variable is declared and assigned correctly.
- Remember that the `startsWith()`, `contains()`, and `endsWith()` methods are case-sensitive.
- The methods return boolean values (`true` or `false`).
- Use the correct syntax when calling these methods:
    - `string.contains("substring")`
    - `string.startsWith("substring")`
    - `string.endsWith("substring")`

## Additional Challenge
- **Extract the Domain Name**
    - Use the `substring()` and `indexOf()` methods to extract the domain part of the email address (the part after the `"@"` symbol).
    - Print the domain name in the format:
        - `Domain name: [domain]`

## Expected Output

Assuming the email address is `"john.doe@example.com"`.

```
Contains '@'? true
Starts with 'info'? false
Ends with '.com'? true
Domain name: example.com
```

## Troubleshooting
- **Compilation Errors**: Check for typos in method names and ensure that all strings are enclosed in double quotes.
- **Incorrect Results**: Verify that the substrings you're checking for match exactly (including case) what's in your email address.
- **Case Sensitivity**: Remember that string methods in Java are case-sensitive.

By completing this exercise, you'll practice using string methods to analyze and manipulate text data in a real-life context. Happy coding!
