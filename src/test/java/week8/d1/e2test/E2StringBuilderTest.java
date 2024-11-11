package week8.d1.e2test;

import org.example.week8.d1.e2.E2StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringBuilderTest {

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
    void testTimeFormatter() {
        E2StringBuilder.main(new String[]{});

        String expectedOutput = "Original: 1200, Formatted: 12:00 PM" + System.lineSeparator() +
                                "Original: 0930, Formatted: 09:30 AM" + System.lineSeparator() +
                                "Original: 1545, Formatted: 03:45 PM" + System.lineSeparator() +
                                "Original: 0000, Formatted: 12:00 AM" + System.lineSeparator() +
                                "Original: 2359, Formatted: 11:59 PM" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the time formatter.\n" +
                "Please ensure that your program correctly uses StringBuilder's insert method and formats the times as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}