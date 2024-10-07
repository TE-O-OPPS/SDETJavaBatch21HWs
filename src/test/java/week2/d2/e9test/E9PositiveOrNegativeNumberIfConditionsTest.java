package week2.d2.e9test;

import org.example.week2.d2.e9.E9PositiveOrNegativeNumberIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E9PositiveOrNegativeNumberIfConditionsTest {

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
    void testNegativeNumber() {
        // Simulate the program with the number -5
        E9PositiveOrNegativeNumberIfConditions.main(new String[]{});
        String expectedOutput = "The number is negative." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly identifies the number -5 as negative.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}