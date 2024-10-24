package week5.d4.e7test;


import org.example.week5.d4.e6.E6Continue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E6ContinueTest {

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
    void testContinueInLoops() {
        E6Continue.main(new String[]{});
        String expectedOutput = "Processing Item1" + System.lineSeparator() +
                                "Processing Item2" + System.lineSeparator() +
                                "Processing Item3" + System.lineSeparator() +
                                "Processing Item4" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sequence.\n" +
                "Please ensure that your program correctly processes the items and skips those that are out of stock.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
