package week8.d6.e1test;

import org.example.week8.d6.e1.E1Constructor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1ConstructorTest {
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
        E1Constructor.main(new String[]{}); // Ensure this matches the actual main class
        // Construct the expected output string based on the expected examples in the main method
        String expectedOutput =
                "null 0 0 null" + System.lineSeparator() +
                        "Syntax 6 2020 07302020" + System.lineSeparator(); // Ensure this matches the actual output
        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput.trim(), outContent.toString().trim());
    }
}