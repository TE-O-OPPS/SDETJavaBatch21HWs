package week7.d6.e3test;

import org.example.week7.d6.e3.E3StringManipulationsP4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3StringManipulationsP4Test {
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
    void testTextMessageExpansion() {
        E3StringManipulationsP4.main(new String[]{});

        String expectedOutput = "Original Message: Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!" + System.lineSeparator() +
                "Expanded Message: Hey! Are you free today? Want to grab lunch before class? Let me know as soon as possible. Thanks!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for expanding the text message.\n" +
                "Please ensure that your program correctly uses the replace method and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}