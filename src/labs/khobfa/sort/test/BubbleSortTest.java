package labs.khobfa.sort.test;

import labs.khobfa.sort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void givenUnsortedArray_thenSort() {
        // GIVEN
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[] {4, 1, 90, 32, -2};

        // WHEN
        bubbleSort.sortOptimized(arr);

        // THEN
        assertArrayEquals(new int[]{-2, 1, 4, 32, 90}, arr);
    }
}