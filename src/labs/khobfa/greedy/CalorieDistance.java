package labs.khobfa.greedy;

import java.util.Arrays;

/**
 * Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories.
 * If Marc has eaten j cupcakes so far, after eating a cupcake with  calories he must walk at least 2^j * c miles to maintain his weight.
 * where j is the index of calorie and c is calorie value
 */
public class CalorieDistance {

    public long findMin(int[] calorie) {
        if (calorie == null || calorie.length == 0) return 0;

        long minDistance = 0;
        Arrays.sort(calorie);

        for (int i = calorie.length; i > 0; i--) {
            minDistance += ((long) Math.pow(2, calorie.length - i) * calorie[i - 1]);
        }

        return minDistance;
    }
}
