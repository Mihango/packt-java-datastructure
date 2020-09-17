package labs.khobfa.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * If Lena loses no more than k important contests, what is the maximum amount of luck she
 * can have after competing in all the preliminary contests
 *
 * games[0] contains luck and games[1] importance...1 is importance 0 is not. On winning luck number decreases
 * while on losing luck number increases
 */
public class LuckBalance {

    public int findMax(int k, int[][] games) {
        Arrays.sort(games, Comparator.comparing(game -> game[0]));

        int curr = 0;
        int maxLuck = 0;

        for (int i = games.length-1; i>= 0; i--) {
            if (games[i][1] == 0) {
                maxLuck += games[i][0];
            } else {
                if (curr < k) {
                    maxLuck += games[i][0];
                } else {
                    maxLuck -= games[i][0];
                }
                ++curr;
            }
        }

        return maxLuck;
    }
}
