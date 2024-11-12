package week8.d2.e8test;

import org.example.week8.d2.e8.E8JavaMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E8JavaMethodsTest {
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
        E8JavaMethods.main(new String[]{});

        String expectedOutput = "h e l l o " + System.lineSeparator() +
                "t e c h n o l o g y " + System.lineSeparator();

        assertEquals("The output does not match the expected results.", expectedOutput, outContent.toString());
    }
}
