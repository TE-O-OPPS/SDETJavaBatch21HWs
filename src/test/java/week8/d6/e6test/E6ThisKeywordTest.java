package week8.d6.e6test;

import org.example.week8.d6.e6.E6ThisKeyword;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E6ThisKeywordTest {
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
        E6ThisKeyword.main(new String[]{});
        // Construct the expected output string using System.lineSeparator() for platform-independent newline
        String expectedOutput =
                "Blanket Total Value 99.98" + System.lineSeparator() +
                        "Mattress Total Value 439.18" + System.lineSeparator() +
                        "You purchased 539.16 Today" ;

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output", expectedOutput, outContent.toString().trim());
    }
}
