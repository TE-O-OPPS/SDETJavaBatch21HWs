package week7.d5.e1test;

import org.example.week7.d5.e1.E1StringManipulationsP2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1StringManipulationsP2Test {

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
    void testIsEmptyMethod() {
        E1StringManipulationsP2.main(new String[]{});

        String expectedOutput = "Is s1 empty? false" + System.lineSeparator() +
                                "Is s2 empty? true" + System.lineSeparator() +
                                "Is s3 empty? false" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the isEmpty() method checks.\n" +
                "Please ensure that your program correctly assigns the string values, checks if they are empty, and prints the results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
