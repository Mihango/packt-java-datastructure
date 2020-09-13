package labs.khobfa.arrays.test;

import labs.khobfa.arrays.CommonData;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonDataTest {

    @Test
    public void givenSimilarArrays_thenCountIsSize() {
        //GIVEN
        CommonData commonData = new CommonData();
        int[] arr = new int[]{1, 2, 3};

        // WHEN
        int count = commonData.countCommon(arr, arr);

        // THEN
        assertEquals(3, count);
    }

    @Test
    public void givenArrayWithSimilar_thenCountIsSizeOfCommon() {
        //GIVEN
        CommonData commonData = new CommonData();
        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 2, 7};

        // WHEN
        int count = commonData.countCommon(arr, arr2);

        // THEN
        assertEquals(1, count);
    }

    @Test
    public void givenArrayWithOutSimilar_thenCountIsSizeOfCommon() {
        //GIVEN
        CommonData commonData = new CommonData();
        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 7};

        // WHEN
        int count = commonData.countCommon(arr, arr2);

        // THEN
        assertEquals(0, count);
    }

}