# String Method Practice: indexOf()

## Objective
Practice using the indexOf() method of the String class in Java to find specific characters or substrings within a string.

## Instructions

**Analyzing a Sentence**

In this exercise, you will work with a sentence and use the indexOf() method to find the positions of specific characters and words.

For you to do:

1. Declare a String variable named `sentence` and assign it the value: "The quick brown fox jumps over the lazy dog."

2. Use the indexOf() method to find the position of the first occurrence of the letter 'o' in the sentence. Store this in an int variable.

3. Use the indexOf() method to find the position of the word "jumps" in the sentence. Store this in an int variable.

4. Use the indexOf() method to find the position of the letter 'z' in the sentence, but start searching from index 20. Store this in an int variable.

5. Use the indexOf() method to try to find the word "cat" in the sentence. Store this in an int variable.

6. Print the results of your searches in the format:
   - Position of first 'o': [index]
   - Position of "jumps": [index]
   - Position of 'z' after index 20: [index]
   - Position of "cat": [index]

## Example Output
```
Position of first 'o': 12
Position of "jumps": 20
Position of 'z' after index 20: 40
Position of "cat": -1
```


## Tips

- The indexOf() method returns the index of the first occurrence of the specified character or substring.
- If the character or substring is not found, indexOf() returns -1.
- Remember that string indices start at 0 in Java.
- The indexOf() method has overloaded versions that allow you to specify a starting index for the search.

## Troubleshooting

- Make sure you're using the correct method name (indexOf).
- Check that you're using the correct string literals in your indexOf() calls.
- Remember that indexOf() is case-sensitive.

By completing this exercise, you'll practice using the indexOf() method to search for characters and substrings within a larger string. Good luck!