package week5.d6.e1test;

import org.example.week5.d6.e1.E1NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1NestedForLoopsTest {

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
    void testExtractingSpecificElements() {
        E1NestedForLoops.main(new String[]{});
        String expectedOutput = "2" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "8" + System.lineSeparator() +
                                "10" + System.lineSeparator() +
                                "12" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sequence of even numbers.\n" +
                "Please ensure that your program correctly extracts and prints only the even numbers from the 2D array.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
