package week8.d4.e3test;

import org.example.week8.d4.e3.E3Variables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3VariablesTest {

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
       E3Variables.main(new String[]{});
       String expectedOutput = "Welcome To Syntax Technologies" + System.lineSeparator() +
               "Welcome To Syntax Technologies" + System.lineSeparator() +
               "Welcome To Syntax Technologies" + System.lineSeparator();
       assertEquals(expectedOutput, outContent.toString());
   }
}