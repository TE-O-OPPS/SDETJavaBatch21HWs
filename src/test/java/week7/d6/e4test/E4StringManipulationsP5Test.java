package week7.d6.e4test;

import org.example.week7.d6.e4.E4StringManipulationsP5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4StringManipulationsP5Test {

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
    void testPhoneNumberFormatting() {
        E4StringManipulationsP5.main(new String[]{});

        String expectedOutput = "Original: (123) 456-7890, Formatted: (123) 456-7890" + System.lineSeparator() +
                "Original: 987-654-3210, Formatted: (987) 654-3210" + System.lineSeparator() +
                "Original: 555.444.3333, Formatted: (555) 444-3333" + System.lineSeparator() +
                "Original: 444 333 2222, Formatted: (444) 333-2222" + System.lineSeparator() +
                "Original: 12345678901, Formatted: 12345678901" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for formatting phone numbers.\n" +
                "Please ensure that your program correctly uses the replaceAll method and formats the numbers as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}