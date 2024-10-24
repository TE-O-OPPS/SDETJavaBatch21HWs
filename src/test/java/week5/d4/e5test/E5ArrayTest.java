package week5.d4.e5test;

import org.example.week5.d4.e5.E5Break;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E5ArrayTest {

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
    void testProcessingOrders() {
        E5Break.main(new String[]{});
        String expectedOutput = "Processing Item1" + System.lineSeparator() +
                                "Processing Item2" + System.lineSeparator() +
                                "Defective item found. Stopping the production line." + System.lineSeparator();

        String failureMessage = "The output does not match the expected processing sequence.\n" +
                "Please ensure that your program correctly processes items and stops when a defective item is found.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
