package labs.khobfa.search;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] arr, int data) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (data == arr[mid]) {
                return mid;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int recursiveSearch(int[] arr, int data) {
        Arrays.sort(arr);
        return helper(arr, data, 0, arr.length - 1);
    }

    private int helper(int[] arr, int data, int low, int high) {
        int mid = (low + high) / 2;
        if (data == arr[mid]) return mid;
        else if (data > arr[mid]) helper(arr, data, mid + 1, high);
        else if (data < arr[mid]) helper(arr, data, low, mid - 1);

        return -1;
    }
}
