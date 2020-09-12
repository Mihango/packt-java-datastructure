package labs.khobfa.search.test;

import labs.khobfa.search.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void givenArray_WhenElementExist_returnIndex() {
        // GIVEN
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 4;

        // WHEN
        int index = binarySearch.search(arr, data);
        System.out.println(Arrays.toString(arr));
        // THEN
        assertEquals(2, index);
    }

    @Test
    public void givenArray_WhenElementDontExist_returnNegative() {
        // GIVEN
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 23;

        // WHEN
        int index = binarySearch.search(arr, data);
        System.out.println(Arrays.toString(arr));
        // THEN
        assertEquals(-1, index);
    }

    @Test
    public void givenArray_WhenRecursiveElementExist_returnIndex() {
        // GIVEN
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 4;

        // WHEN
        int index = binarySearch.recursiveSearch(arr, data);
        System.out.println(Arrays.toString(arr));
        // THEN
        assertEquals(2, index);
    }

    @Test
    public void givenArray_WhenRecursiveElementDontExist_returnNegative() {
        // GIVEN
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = new int[]{2, 20, 3, 4, 32};
        int data = 23;

        // WHEN
        int index = binarySearch.recursiveSearch(arr, data);
        System.out.println(Arrays.toString(arr));
        // THEN
        assertEquals(-1, index);
    }
}