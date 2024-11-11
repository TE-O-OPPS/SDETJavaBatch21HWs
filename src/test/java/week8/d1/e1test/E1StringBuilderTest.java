package week8.d1.e1test;

import org.example.week8.d1.e1.E1StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1StringBuilderTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPalindromeChecker() {
        E1StringBuilder.main(new String[]{});

        String expectedOutput = "Original phrase: A man, a plan, a canal: Panama" + System.lineSeparator() +
                                "Cleaned phrase: amanaplanacanalpanama" + System.lineSeparator() +
                                "Reversed phrase: amanaplanacanalpanama" + System.lineSeparator() +
                                "\"A man, a plan, a canal: Panama\" is a palindrome." + System.lineSeparator() +
                                System.lineSeparator() +
                                "Original phrase: race a car" + System.lineSeparator() +
                                "Cleaned phrase: raceacar" + System.lineSeparator() +
                                "Reversed phrase: racaecar" + System.lineSeparator() +
                                "\"race a car\" is not a palindrome." + System.lineSeparator() +
                                System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the palindrome checker.\n" +
                "Please ensure that your program correctly uses StringBuilder methods and checks for palindromes as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}