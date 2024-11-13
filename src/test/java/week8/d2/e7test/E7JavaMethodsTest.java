package week8.d2.e7test;

import org.example.week8.d2.e7.E7JavaMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E7JavaMethodsTest {

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
    void testMainMethodOutput() {
        E7JavaMethods.main(new String[]{});

        String expectedOutput = "sumEvenToX(5) ==> 6" + System.lineSeparator() +
                "sumEvenToX(8) ==> 20" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results.\n" +
                "Please ensure that your main method correctly calls sumEvenToX method and prints the results as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}