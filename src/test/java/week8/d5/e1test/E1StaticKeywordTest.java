package week8.d5.e1test;

import org.example.week8.d5.e1.E1StaticKeyword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E1StaticKeywordTest {

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
        E1StaticKeyword.main(new String[]{});
        String expectedOutput = "Programming is amazing." + System.lineSeparator()+
        "Java is awesome."+ System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
