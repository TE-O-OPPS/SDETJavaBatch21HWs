package week8.d4.e2test;

import org.example.week8.d4.e2.E2Variables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2VariablesTest {

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
  public   void testMethodOutputs() {
        E2Variables.main(new String[]{});
        String expectedOutput = "10" + System.lineSeparator() +
                "10.23" + System.lineSeparator() +
                "a" + System.lineSeparator() +
                "100" + System.lineSeparator() +
                "100.23" + System.lineSeparator() +
                "s" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}