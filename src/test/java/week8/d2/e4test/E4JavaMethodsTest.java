package week8.d2.e4test;

import org.example.week8.d2.e4.E4JavaMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E4JavaMethodsTest {

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
    void testArithmeticMethods() {
        E4JavaMethods.main(new String[]{});
        String expectedOutput = "Addition 30" + System.lineSeparator() +
                                "Multiplication 30" + System.lineSeparator() +
                                "Subtraction 20" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you call the methods with the correct arguments and print the results correctly.");
    }
}
