package labs.khobfa.stack.test;

import labs.khobfa.stack.EqualStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualStackTest {

    @Test
    public void givenArrays_thenResultFive() {
        // GIVEN
        EqualStack equalStack = new EqualStack();

        // WHEN
        int height = equalStack.equalHeightStack(
                new int[]{3, 2, 1, 1, 1},
                new int[]{4, 3, 2},
                new int[]{1, 1, 4, 1}
        );
        // THEN
        assertEquals(5, height);
    }

    @Test
    public void givenArrayWithZero_thenResultZero() {
        // GIVEN
        EqualStack equalStack = new EqualStack();

        // WHEN
        int height = equalStack.equalHeightStack(
                new int[]{3, 2, 1, 1, 1},
                new int[]{4, 3, 2},
                new int[]{0}
        );
        // THEN
        assertEquals(0, height);
    }

}