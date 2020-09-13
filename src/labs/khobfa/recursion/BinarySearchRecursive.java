package labs.khobfa.recursion;

import java.util.Arrays;

public class BinarySearchRecursive {

    public boolean search(int x, int[] arr) {
        Arrays.sort(arr);
        return search(x, arr, 0, arr.length);
    }

    private boolean search(int item, int[] arr, int start, int end) {
        if(start > end) return false;

        int mid = (start + end) / 2;

        if (arr[mid] == item) return true;
        else if (item < arr[mid]) return search(item, arr, start, mid-1);
        else return search(item, arr, mid+1, end);
    }

    public static void main(String[] args) {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        System.out.println("2 found >>> " + binarySearchRecursive.search(0, new int[] {4, 3, 2, 1}));
    }
}
