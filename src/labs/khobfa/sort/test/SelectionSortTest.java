package labs.khobfa.sort.test;

import labs.khobfa.sort.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void givenUnsortedArray_thenSortAscending() {
        // GIVEN
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{ 45, 37, 13, -12};

        //  WHEN
        selectionSort.sort(arr);

        assertArrayEquals(new int[]{-12, 13, 37, 45}, arr);
    }
}