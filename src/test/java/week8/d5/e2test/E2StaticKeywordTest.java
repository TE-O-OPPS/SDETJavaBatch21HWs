package week8.d5.e2test;

import org.example.week8.d5.e2.E2StaticKeyword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E2StaticKeywordTest {
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
        E2StaticKeyword.main(new String[]{});
        String expectedOutput = "1a2b3c4d5e" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}