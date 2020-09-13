package labs.khobfa.sort;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) { SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{ 45, 37, 13, -12};

        //  WHEN
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
