package week8.d1.e3test;

import org.example.week8.d1.e3.E3StringBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E3StringBuilderTest {
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
    void testProductCodeCleaner() {
        E3StringBuilder.main(new String[]{});

        String expectedOutput = "Original: ABC-123-XYZ, Cleaned: ABC123XYZ" + System.lineSeparator() +
                "Original: PQR-456-789-UVW, Cleaned: PQR456789" + System.lineSeparator() +
                "Original: XXX---111, Cleaned: XXX111" + System.lineSeparator() +
                "Original: 555-ZZZ-, Cleaned: 555ZZZ" + System.lineSeparator() +
                "Original: -999-YYY, Cleaned: 999YYY" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for the product code cleaner.\n" +
                "Please ensure that your program correctly uses StringBuilder's delete method and formats the codes as specified.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }


}