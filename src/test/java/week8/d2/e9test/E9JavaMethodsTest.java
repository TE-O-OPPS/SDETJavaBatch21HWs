package week8.d2.e9test;

import org.example.week8.d2.e9.E9JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E9JavaMethodsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        // Call the main method of E9JavaMethods, which should print the results of censorLetter
        E9JavaMethods.main(new String[]{});

        // Define the expected output based on the expected behavior of censorLetter
        String expectedOutput = "comput*r sci*nc*" + System.lineSeparator() +
                "*rick or *rea*" + System.lineSeparator();

        // Assert that the captured output matches the expected output
        assertEquals("The output does not match the expected results.", expectedOutput, outContent.toString());
    }
}
