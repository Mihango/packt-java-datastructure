package labs.khobfa.binary.test;

import labs.khobfa.binary.BinaryConversion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class BinaryConversionTest {

    // setting time out
    @Rule
    public Timeout globalTimeout = Timeout.millis(2);

    @Test
    public void given100_Then_Display_Four() {
        BinaryConversion binaryConversion = new BinaryConversion();
        long result = binaryConversion.convertToDecimal("100");
        assertEquals(4, result);
    }

    @Test
    public void given110_Then_Display_Six() {
        BinaryConversion binaryConversion = new BinaryConversion();
        long result = binaryConversion.convertToDecimal("110");
        assertEquals(6, result);
    }

    @Test
    public void given111_Then_Display_Seven() {
        BinaryConversion binaryConversion = new BinaryConversion();
        long result = binaryConversion.convertToDecimal("111");
        assertEquals(7, result);
    }
}