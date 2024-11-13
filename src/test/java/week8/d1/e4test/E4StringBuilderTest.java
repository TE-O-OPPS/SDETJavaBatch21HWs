package week8.d1.e4test;

import org.example.week8.d1.e4.E4StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4StringBuilderTest {

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
    void testVowelRemoval() {
        E4StringBuilder.main(new String[]{});

        String expectedOutput = "Original: hello, Without Vowels: hll" + System.lineSeparator() +
                                "Original: world, Without Vowels: wrld" + System.lineSeparator() +
                                "Original: java, Without Vowels: jv" + System.lineSeparator() +
                                "Original: programming, Without Vowels: prgrmmng" + System.lineSeparator() +
                                "Original: exercise, Without Vowels: xrcs" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for vowel removal.\n" +
                "Please ensure that your program correctly uses StringBuilder's deleteCharAt method and removes vowels as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}