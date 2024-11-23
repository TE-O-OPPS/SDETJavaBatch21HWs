package week7.d5.e5test;

import org.example.week7.d5.e5.E5StringManipulationsP3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E5StringManipulationsP3Test {

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
    void testEmailValidation() {
        E5StringManipulationsP3.main(new String[]{});

        String expectedOutput = "Email starts with a letter: true" + System.lineSeparator() +
                                "5th character is @: true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the email validation.\n" +
                "Please ensure that your program correctly analyzes the email address and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}