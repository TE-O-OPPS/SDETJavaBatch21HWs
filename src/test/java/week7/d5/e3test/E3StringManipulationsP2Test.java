package week7.d5.e3test;

import org.example.week7.d5.e3.E3StringManipulationsP2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3StringManipulationsP2Test {

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
    void testEmailProcessing() {
        E3StringManipulationsP2.main(new String[]{});

        String expectedOutput = "Contains '@'? true" + System.lineSeparator() +
                                "Starts with 'info'? false" + System.lineSeparator() +
                                "Ends with '.com'? true" + System.lineSeparator() +
                                "Domain name: example.com" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the email string method checks.\n" +
                "Please ensure that your program correctly assigns the email address, performs the checks, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
