package week8.d5.e5test;

import org.example.week8.d5.e5.E5AccessModifiers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E5AccessModifiersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        // Execute the main method to generate output
        E5AccessModifiers.main(new String[]{});
        // Construct the expected output string based on the hardcoded examples in the main method
        String expectedOutput =
                "default" + System.lineSeparator() +
                        "protected" + System.lineSeparator() +
                        "public";
        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput, outContent.toString().trim());
    }
}