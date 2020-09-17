package labs.khobfa.greedy;

import java.util.Arrays;

public class MaximumTasks {

    public int calculate(int[] arr, int max) {
        if (arr == null || arr.length == 0) return 0;

        Arrays.sort(arr);

        int currTime = 0;
        int items = 0;

        for (int j : arr) {
            currTime += j;
            if (currTime > max) break;

            ++items;
        }

        return items;
    }
}
