package week7.d6.e5test;

import org.example.week7.d6.e5.E5StringManipulationsP5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5StringManipulationsP5Test {
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
    void testCSVDataAnalysis() {
        E5StringManipulationsP5.main(new String[]{});

        String expectedOutput = "Name: John Doe" + System.lineSeparator() +
                "Age: 22" + System.lineSeparator() +
                "Major: Computer Science" + System.lineSeparator() +
                "GPA: 3.8" + System.lineSeparator() +
                "Graduation Year: 2025" + System.lineSeparator() +
                "Name Word Count: 2" + System.lineSeparator() +
                "Major Length: 16" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for analyzing CSV data.\n" +
                "Please ensure that your program correctly uses the split method and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}