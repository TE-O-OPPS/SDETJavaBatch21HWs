package week8.d4.e1test;


import org.example.week8.d4.e1.E1Variables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1VariablesTest {

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
    void testMethodOutputs() {
        E1Variables.main(new String[]{});
        String expectedOutput = "I am a student of batch 200 studying at Syntax in the year of 2050." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

    }



}
