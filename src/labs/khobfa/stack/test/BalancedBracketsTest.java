package labs.khobfa.stack.test;

import labs.khobfa.stack.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void givenBalanceBracket_then_returnTrue() {
        // GIVEN
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        String brackets = "[{()}]";

        // WHEN
        boolean isBalanced = balancedBrackets.isBalanced(brackets);

        // THEN
        assertTrue(isBalanced);
    }

    @Test
    public void givenUnBalanceBracket_then_returnTrue() {
        // GIVEN
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        String brackets = "[{(}]";

        // WHEN
        boolean isBalanced = balancedBrackets.isBalanced(brackets);

        // THEN
        assertFalse(isBalanced);
    }

    @Test
    public void givenEmpty_then_returnTrue() {
        // GIVEN
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        String brackets = "";

        // WHEN
        boolean isBalanced = balancedBrackets.isBalanced(brackets);

        // THEN
        assertTrue(isBalanced);
    }

}