package week8.d2.e6test;

import org.example.week8.d2.e6.E6JavaMethods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E6JavaMethodsTest {

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
    void testBothEvenMethod() {
        E6JavaMethods.main(new String[]{});
        String expectedOutput = "false" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString(), "The output does not match the expected result. Ensure that you call the bothEven method from the main method with various arguments to test the method.");
    }
}
