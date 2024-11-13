# StringBuilder Method Practice: deleteCharAt()

## Objective
Practice using the deleteCharAt() method of the StringBuilder class in Java to remove specific characters from a string efficiently.

## Instructions

**Removing Vowels from Words**

In this exercise, you will create a program that removes all vowels from a set of words. You'll use StringBuilder and its deleteCharAt() method to efficiently manipulate the strings.

For you to do:

1. Declare a String array named `words` and assign it the following values:
   {"hello", "world", "java", "programming", "exercise"}

2. Create a method called `removeVowels` that takes a String as input and returns a String with all vowels removed. In this method:
   a) Create a StringBuilder object with the input word.
   b) Iterate through the StringBuilder from end to beginning.
   c) Use the deleteCharAt() method to remove any vowel (a, e, i, o, u, and their uppercase versions).
   d) Return the modified string.

3. In the main method, iterate through the `words` array:
   a) Call the `removeVowels` method for each word.
   b) Print each original word and its vowel-free version in the following format:
   - Original: [original word], Without Vowels: [modified word]

## Example Output
```
Original: hello, Without Vowels: hll
Original: world, Without Vowels: wrld
Original: java, Without Vowels: jv
Original: programming, Without Vowels: prgrmmng
Original: exercise, Without Vowels: xrcs
```


## Tips

- The deleteCharAt() method removes a single character at a specified index.
- Iterate from end to beginning to avoid index shifting issues when removing characters.
- You can use Character.toLowerCase() to handle both uppercase and lowercase vowels uniformly.
- Remember that StringBuilder modifies the string in place, which is efficient for multiple operations.

## Troubleshooting

- Make sure you're using the correct method name (deleteCharAt).
- Be careful with the indices when deleting - remember that string indices start at 0.
- Ensure you're checking for both uppercase and lowercase vowels.

By completing this exercise, you'll practice using the StringBuilder deleteCharAt() method to remove specific characters from strings, simulating a real-world scenario of text processing. This task demonstrates the efficiency of StringBuilder for character-level string manipulations, which is often needed in various text processing applications. Good luck!