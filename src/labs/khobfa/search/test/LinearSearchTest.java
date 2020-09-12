package labs.khobfa.search.test;

import labs.khobfa.search.LinearSearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void givenArray_WhenElementExit_thenReturnIndex() {
        // GIVEN
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 2;

        // WHEN
        int index = linearSearch.search(arr, data);

        // THEN
        assertEquals(0, index);
    }

    @Test
    public void givenArray_WhenElementDontExist_thenReturnNegative() {
        // GIVEN
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 22;

        // WHEN
        int index = linearSearch.search(arr, data);

        // THEN
        assertEquals(-1, index);
    }
}