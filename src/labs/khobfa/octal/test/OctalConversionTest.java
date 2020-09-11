package labs.khobfa.octal.test;

import labs.khobfa.octal.OctalConversion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OctalConversionTest {

    @Test
    public void given_17_Then_Return15() {
        OctalConversion octalConversion = new OctalConversion();
        long result = octalConversion.convertToDecimal("17");
        assertEquals(15, result);
    }

    @Test
    public void given_77_Then_Return63() {
        OctalConversion octalConversion = new OctalConversion();
        long result = octalConversion.convertToDecimal("77");
        assertEquals(63, result);
    }
}