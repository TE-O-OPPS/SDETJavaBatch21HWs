package week5.d4.e3test;

import org.example.week5.d4.e3.E3EnhancedForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3EnhancedForLoopTest {

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
    void testBreakInLoops() {
        E3EnhancedForLoop.main(new String[]{});
        String expectedOutput = "12" + System.lineSeparator() +
                                "23" + System.lineSeparator() +
                                "34" + System.lineSeparator() +
                                "45" + System.lineSeparator() +
                                "56" + System.lineSeparator() +
                                "67" + System.lineSeparator() +
                                "78" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sequence.\n" +
                "Please ensure that your program correctly processes the numbers and stops when a number greater than 80 is encountered.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
