package week5.d5.e1test;

import org.example.week5.d5.e1.E1TwoDArrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1TwoDArraysTest {

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
    void test2DArraysOutput() {
        E1TwoDArrays.main(new String[]{});
        String expectedOutput = "1 2 3" + System.lineSeparator() +
                                "4 5 6" + System.lineSeparator() +
                                "7 8 9" + System.lineSeparator();

        String failureMessage = "The output does not match the expected 2D array.\n" +
                "Please ensure that your program correctly initializes and prints the 2D array using direct index access.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
