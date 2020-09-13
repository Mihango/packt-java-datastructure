package labs.khobfa.stack.test;

import labs.khobfa.stack.MaximumElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MaximumElementTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test(timeout = 1) // setting timeouts
    public void givenCommand_whenMaxElement_thenPrintMax() {
        // GIVEN
        MaximumElement maximumElement = new MaximumElement();
        int[][] arr = new int[][]{
                new int[]{1, 97},
                new int[]{2},
                new int[]{1, 20},
                new int[]{2},
                new int[]{1, 26},
                new int[]{1, 20},
                new int[]{2},
                new int[]{3},
                new int[]{1, 91},
                new int[]{3}
        };

        // WHEN
        maximumElement.process(arr);

        // THEN
        assertEquals("26\n91", outputStream.toString().trim());
    }

    @Test
    public void testMathMin() {
        System.out.println(Math.min(45, 45));
        assertEquals(45, Math.min(45, 45));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

}