package labs.khobfa.greedy.test;

import labs.khobfa.greedy.MinimumAbsoluteDiff;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAbsoluteDiffTest {

    @Test
    public void givenArray_returnMinAs2() {
        // GIVEN
        MinimumAbsoluteDiff minimumAbsoluteDiff = new MinimumAbsoluteDiff();
        int[] arr = {-2, 4, 2};

        // WHEN
        int min = minimumAbsoluteDiff.findMin(arr);

        // THEN
        assertEquals(2, min);
    }
}