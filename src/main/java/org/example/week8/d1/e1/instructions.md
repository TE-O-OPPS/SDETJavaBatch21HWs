# StringBuilder Method Practice: append() and reverse()

## Objective
Practice using the append() and reverse() methods of the StringBuilder class in Java to manipulate strings efficiently.

## Instructions

**Creating a Palindrome Checker**

In this exercise, you will create a program that checks if a given phrase is a palindrome (reads the same forwards and backwards, ignoring spaces and punctuation). You'll use StringBuilder to efficiently manipulate the string.

For you to do:

1. Declare a String variable named `phrase` and assign it the value:
   "A man, a plan, a canal: Panama"

2. Create a StringBuilder object and use the append() method to add each character of the phrase to it, but only if the character is a letter. Ignore spaces, punctuation, and convert everything to lowercase.

3. After appending all valid characters, print the "cleaned" version of the phrase.

4. Create a new StringBuilder with the cleaned phrase and use the reverse() method to reverse it.

5. Compare the original cleaned StringBuilder with the reversed one to check if the phrase is a palindrome.

6. Print whether the original phrase is a palindrome or not.

7. Repeat steps 1-6 with another phrase: "race a car"

## Example Output
```
Original phrase: A man, a plan, a canal: Panama
Cleaned phrase: amanaplanacanalpanama
Reversed phrase: amanaplanacanalpanama
"A man, a plan, a canal: Panama" is a palindrome.

Original phrase: race a car
Cleaned phrase: raceacar
Reversed phrase: racecar
"race a car" is not a palindrome.
```


## Tips

- Use StringBuilder's append() method to build the cleaned string character by character.
- The Character.isLetter() method can help you check if a character is a letter.
- StringBuilder's reverse() method reverses the entire string in place.
- You can convert a StringBuilder to a String using the toString() method for comparison.

## Troubleshooting

- Make sure you're using StringBuilder methods, not String methods.
- Remember that StringBuilder modifies the string in place, while String creates new objects.
- Be careful to handle uppercase and lowercase letters correctly.

By completing this exercise, you'll practice using StringBuilder methods to efficiently manipulate strings, simulating a real-world scenario of checking for palindromes. This task demonstrates the power of StringBuilder for string manipulation tasks, especially when dealing with larger strings or frequent modifications. Good luck!