package labs.khobfa.greedy;

import java.util.Arrays;

/**
 * Given an array of integers, find and print the minimum absolute difference between any two
 * elements in the array. For example, given the array arr=[-2, 2,4] we can create  pairs of numbers:
 * [-2,2], [-2, 4] and [2,4]. The absolute differences for these pairs are [(-2)-2]=4, [(-2)-4] = 6  and
 * [2-4] = 2. The minimum absolute difference is 2.
 * <p>
 * To solve the problem  simply sort the array to ensure that the absolute
 * difference between each element and its adjacent element(s) is minimal
 */
public class MinimumAbsoluteDiff {

    public int findMin(int[] arr) {
        // sort array
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        return min;
    }
}
