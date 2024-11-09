# String Method Practice: replace()

## Objective
Practice using the replace() method of the String class in Java to expand common text message abbreviations.

## Instructions

**Expanding Text Message Abbreviations**

In this exercise, you will work with a string that represents a text message with common abbreviations. You'll use the replace() method to expand these abbreviations into their full forms.

For you to do:

1. Declare a String variable named `textMessage` and assign it the value:
   "Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!"

2. Replace "R u" with "Are you"
3. Replace "2day" with "today"
4. Replace "Wanna" with "Want to"
5. Replace "b4" with "before"
6. Replace "LMK" with "Let me know"
7. Replace "ASAP" with "as soon as possible"
8. Replace "THX" with "Thanks"

9. Print the original message and the expanded version in the following format:
    - Original Message: [original string]
    - Expanded Message: [modified string]

## Example Output
```
Original Message: Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!
Expanded Message: Hey! Are you free today? Want to grab lunch before class? Let me know as soon as possible. Thanks!

```

## Tips

- The replace() method returns a new string with the replacements, it doesn't modify the original string.
- You can chain multiple replace() calls together.
- replace() is case-sensitive, so be careful with uppercase and lowercase letters.

## Troubleshooting

- Make sure you're using the correct method name (replace).
- Remember that strings are immutable in Java, so you need to assign the result of replace() to a variable.
- Double-check your spelling and capitalization in both the abbreviations and their expansions.

By completing this exercise, you'll practice using the replace() method to modify string content, simulating the real-world task of expanding text message abbreviations. This is a relatable scenario that demonstrates how string manipulation can be used in everyday communication contexts. Good luck!