package week7.d6.e1test;

import org.example.week7.d6.e1.E1StringManipulationsP4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1StringManipulationsP4Test {

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
    void testSubstringOperations() {
        E1StringManipulationsP4.main(new String[]{});

        String expectedOutput = "ID: 12345" + System.lineSeparator() +
                                "Name: John Doe" + System.lineSeparator() +
                                "Age: 30" + System.lineSeparator() +
                                "City Info: CITY:New York" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the substring operations.\n" +
                "Please ensure that your program correctly uses the substring method and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}