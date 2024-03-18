//package studentGradeCalculatorTests;
//
//import org.codSoft.StudentGradeCalculator.GradeDisplay;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.io.PrintStream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class StudentTests {
//
//    private final PrintStream standardOut = System.out;
//    private final InputStream standardIn = System.in;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//    @BeforeEach
//    public void setUp() {
//        System.setOut(new PrintStream(outputStreamCaptor));
//    }
//
//    @AfterEach
//    public void tearDown() {
//        System.setOut(standardOut);
//        System.setIn(standardIn);
//    }
//
//    private void verifyOutput(String[] actualOutput, String[] expectedOutput) {
//        for (int i = actualOutput.length - 1, j = expectedOutput.length - 1; j >= 0; i--, j--) {
//            assertEquals(expectedOutput[j], actualOutput[i]);
//        }
//    }
//
//    @Test
//    void testOff() {
//        InputStream mockedInput = new ByteArrayInputStream("LEE\noff\n".getBytes());
//        System.setIn(mockedInput);
//        GradeDisplay.main(new String[]{});
//        String[] actualOutput = outputStreamCaptor.toString().trim().split("\n");
//        String[] expectedOutput = {"What is your name? ",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Shutting down..."};
//        verifyOutput(actualOutput, expectedOutput);
//    }
//
//    @Test
//    void testInvalidCommand() {
//        InputStream mockedInput = new ByteArrayInputStream("LEE\ninvalid\noff\n".getBytes());
//        System.setIn(mockedInput);
//        GradeDisplay.main(new String[]{});
//        String[] actualOutput = outputStreamCaptor.toString().trim().split("\n");
//        String[] expectedOutput = {"What is your name? ",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Sorry, I did not understand 'invalid'.",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Shutting down..."};
//        verifyOutput(actualOutput, expectedOutput);
//    }
//
//    @Test
//    void test_Correct() {
//        InputStream mockedInput = new ByteArrayInputStream("LEE\nMathematics 98\noff\n".getBytes());
//        System.setIn(mockedInput);
//        GradeDisplay.main(new String[]{});
//        String[] actualOutput = outputStreamCaptor.toString().trim().split("\n");
//        String[] expectedOutput = {"What is your name? ",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Mathematics: A+, ",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Shutting down...",
//                "LEE"};
//        verifyOutput(actualOutput, expectedOutput);
//    }
//
//    @Test
//    void testForwardPastLimit() {
//        InputStream mockedInput = new ByteArrayInputStream("LEE\nMathematics 210\noff\n".getBytes());
//        System.setIn(mockedInput);
//        GradeDisplay.main(new String[]{});
//        String[] actualOutput = outputStreamCaptor.toString().trim().split("\n");
//        String[] expectedOutput = {"What is your name? ",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Invalid percentage: 210",
//                "LEE> Enter Your Studies, And Grade?",
//                "LEE > Shutting down...",
//                "LEE"};
//        verifyOutput(actualOutput, expectedOutput);
//    }
//
//
//}
