package week7.d4.e5test;

import org.example.week7.d4.e5.E5StringManipulationsP1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E5StringManipulationsP1Test {

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
    void testStringConcatenation() {
        E5StringManipulationsP1.main(new String[]{});
        String expectedOutput = "Hello World" + System.lineSeparator();

        String failureMessage = "The output does not match the expected concatenated string.\n" +
                "Please ensure that your program correctly concatenates the strings and prints the result.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
