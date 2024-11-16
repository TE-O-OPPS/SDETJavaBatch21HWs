package week8.d4.e4test;

import org.example.week8.d4.e4.E4Variables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E4VariablesTest {

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

    @org.junit.jupiter.api.Test
    public void testMethodOutputs() {
        E4Variables.main(new String[]{});
        String expectedOutput = "200" + System.lineSeparator()+"200" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}