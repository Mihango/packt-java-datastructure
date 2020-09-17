package labs.khobfa.greedy;

import java.util.Arrays;

/**
 * Sort all arrays as char and check whether they are sorted in column view
 */
public class GridChallenge {

    String gridChallenge(String[] grid) {
        if(grid == null || grid.length == 0) return "NO";

        char[][] arr = new char[grid.length][grid[0].length()];
        for(int i = 0; i < grid.length; i++) {
            arr[i] = grid[i].toCharArray();
            Arrays.sort(arr[i]);
        }

        int col = 0;
        for(int i = 0; i < arr[0].length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[j-1][col] > arr[j][col]) return "NO";
            }
            ++col;
        }

        return "YES";
    }
}
