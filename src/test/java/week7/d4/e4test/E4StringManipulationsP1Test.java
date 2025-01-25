package week7.d4.e4test;

import org.example.week7.d4.e4.E4StringManipulationsP1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4StringManipulationsP1Test {

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
    void testStringLength() {
        E4StringManipulationsP1.main(new String[]{});
        String expectedOutput = "5" + System.lineSeparator();

        String failureMessage = "The output does not match the expected length of the string.\n" +
                "Please ensure that your program correctly assigns the string value, calculates the length, and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
