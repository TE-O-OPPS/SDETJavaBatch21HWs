package week8.d2.e3test;

import org.example.week8.d2.e3.E3JavaMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3JavaMethodsTest {

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
    void testPrintTimeMethod() {
        E3JavaMethods.main(new String[]{});
        String expectedOutput = "11:30" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you call the printTime method from the main method with the correct arguments.");
    }
}
