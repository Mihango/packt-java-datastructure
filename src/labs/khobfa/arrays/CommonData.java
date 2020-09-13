package labs.khobfa.arrays;

import java.util.Arrays;

/**
 * Given two arrays determine what is count what is common between them
 */
public class CommonData {

    public int countCommon(int[] a, int[] b) {
        if (a.length > b.length) countCommon(b, a);
        // sort the arrays
        Arrays.sort(a);
        Arrays.sort(b);

        int ai = 0;
        int bi = 0;
        int count = 0;

        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                ++ai;
            } else if (a[ai] > b[bi]) {
                ++bi;
            } else {
                ++count;
                ++ai;
                ++bi;
            }
        }

        return count;
    }
}
