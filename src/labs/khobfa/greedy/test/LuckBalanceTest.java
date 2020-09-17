package labs.khobfa.greedy.test;

import labs.khobfa.greedy.LuckBalance;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuckBalanceTest {

    @Test
    public void getMaxLuckNumbers_givenArrayWithImportantAndUnimportantGames() {
        //GIVEN
        int[][] games = {
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0}
        };
        LuckBalance luckBalance = new LuckBalance();

        //WHEN
        int luck = luckBalance.findMax(3, games);

        // THEN
        assertEquals(29, luck);
    }
}