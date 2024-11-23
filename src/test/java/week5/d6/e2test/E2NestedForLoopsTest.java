package week5.d6.e2test;

import org.example.week5.d6.e2.E2NestedForLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2NestedForLoopsTest {

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
    void testSummingRowsIn2DArray() {
        E2NestedForLoops.main(new String[]{});
        String expectedOutput = "Sum of row 1: 10" + System.lineSeparator() +
                                "Sum of row 2: 12" + System.lineSeparator() +
                                "Sum of row 3: 15" + System.lineSeparator();

        String failureMessage = "The output does not match the expected sums of rows.\n" +
                "Please ensure that your program correctly calculates and prints the sum of each row in the 2D array.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
