package week5.d4.e6test;


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
    void testFilteringSensorReadings() {
        E6Continue.main(new String[]{});
        String expectedOutput = "Valid reading: 15.5 units" + System.lineSeparator() +
                "Valid reading: 20.0 units" + System.lineSeparator() +
                "Valid reading: 22.5 units" + System.lineSeparator() +
                "Valid reading: 18.0 units" + System.lineSeparator() +
                "Valid reading: 21.5 units" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sequence.\n" +
                "Please ensure that your program correctly processes valid readings and skips negative values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
