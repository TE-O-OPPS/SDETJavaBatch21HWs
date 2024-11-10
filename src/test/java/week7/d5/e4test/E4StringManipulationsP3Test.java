package week7.d5.e4test;

import org.example.week7.d5.e4.E4StringManipulationsP3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4StringManipulationsP3Test {

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
    void testProductCodeValidation() {
        E4StringManipulationsP3.main(new String[]{});

        String expectedOutput = "Product code starts with 'K': true" + System.lineSeparator() +
                                "Product code ends with '5': true" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the product code validation.\n" +
                "Please ensure that your program correctly analyzes the product code and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
