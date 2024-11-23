package week7.d5.e2test;

import org.example.week7.d5.e2.E2StringManipulationsP2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringManipulationsP2Test {

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
    void testTrimMethod() {
        E2StringManipulationsP2.main(new String[]{});

        String expectedOutput = "Original str1: '   Learn Java   '" + System.lineSeparator() +
                                "Trimmed str1: 'Learn Java'" + System.lineSeparator() +
                                "Original str2: '\tPractice Makes Perfect\t'" + System.lineSeparator() +
                                "Trimmed str2: 'Practice Makes Perfect'" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the trim() method.\n" +
                "Please ensure that your program correctly trims the strings and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
