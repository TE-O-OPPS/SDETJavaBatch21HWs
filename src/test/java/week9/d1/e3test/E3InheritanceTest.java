package week9.d1.e3test;

import org.example.week9.d1.e3.E3Inheritance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3InheritanceTest {

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
    public void testBankingOperationsOutput() {
        // Execute the main method from E151Inheritance class, which should print the bank account details
        E3Inheritance.main(new String[]{});

        // Construct the expected output string based on the operations in E151Inheritance
        String expectedOutput =
                "Account Holder: John Doe" + System.lineSeparator() +
                        "Account Number: 123456789" + System.lineSeparator() +
                        "Balance: 1050.0" + System.lineSeparator() +
                        "" + System.lineSeparator() +
                        "Account Holder: Jane Smith" + System.lineSeparator() +
                        "Account Number: 987654321" + System.lineSeparator() +
                        "Balance: -50.0";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}
