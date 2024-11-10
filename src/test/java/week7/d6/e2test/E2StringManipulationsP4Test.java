package week7.d6.e2test;

import org.example.week7.d6.e2.E2StringManipulationsP4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E2StringManipulationsP4Test {

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
    void testLogEntryParsing() {
        E2StringManipulationsP4.main(new String[]{});

        String expectedOutput = "Date: 2023-03-15" + System.lineSeparator() +
                "Time: 09:42:17" + System.lineSeparator() +
                "Log Level: INFO" + System.lineSeparator() +
                "Service: UserService" + System.lineSeparator() +
                "User: jsmith" + System.lineSeparator() +
                "IP Address: 192.168.1.101" + System.lineSeparator();

        String failureMessage = "The output does not match the expected results for parsing the log entry.\n" +
                "Please ensure that your program correctly uses the substring method and prints the correct results.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}