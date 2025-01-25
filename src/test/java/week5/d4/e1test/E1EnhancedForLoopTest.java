package week5.d4.e1test;


import org.example.week5.d4.e1.E1EnhancedForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1EnhancedForLoopTest {

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

    @Test
    void testArrayValues() {
        E1EnhancedForLoop.main(new String[]{});
        String expectedOutput = "2010" + System.lineSeparator() +
                                "2011" + System.lineSeparator() +
                                "2012" + System.lineSeparator() +
                                "2013" + System.lineSeparator() +
                                "2014" + System.lineSeparator() +
                                "2015" + System.lineSeparator() +
                                "2016" + System.lineSeparator() +
                                "2017" + System.lineSeparator() +
                                "2018" + System.lineSeparator() +
                                "2019" + System.lineSeparator() +
                                "2020" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the array.\n" +
                "Please ensure that your program correctly creates the array and prints all values.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
