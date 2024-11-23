package week9.d1.e2test;

import org.example.week9.d1.e2.E2Inheritance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class E2InheritanceTest {

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
            E2Inheritance.main(new String[]{});
            // Construct the expected output string using System.lineSeparator() for platform-independent newline
            String expectedOutput =
                    "Joe Smith 35 35000" + System.lineSeparator() +
                            "Adam Smith 15 10" + System.lineSeparator() +
                            "Frank Smith 15 tour";

            // Asserts that the captured output matches the expected output
            assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
        }
}
