package labs.khobfa.stack;

import java.util.Stack;

public class EqualStack {

    public int equalHeightStack(int[] ha1, int[] ha2, int[] ha3) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        int h1 = 0, h2 = 0, h3 = 0;
        int minStack;

        for (int i = ha1.length - 1; i >= 0; i--) {
            s1.push(ha1[i]);
            h1 += ha1[i];
        }

        for (int i = ha2.length - 1; i >= 0; i--) {
            s2.push(ha2[i]);
            h2 += ha2[i];
        }

        for (int i = ha3.length - 1; i >= 0; i--) {
            s3.push(ha3[i]);
            h3 += ha3[i];
        }

        minStack = Math.min(h1, Math.min(h2, h3));

        while (h1 != h2 || h1 != h3) {
            while (h1 > minStack) h1 -= s1.pop();
            minStack = Math.min(h1, Math.min(h2, h3));

            while (h2 > minStack) h2 -= s2.pop();
            minStack = Math.min(h1, Math.min(h2, h3));

            while (h3 > minStack) h3 -= s3.pop();
            minStack = Math.min(h1, Math.min(h2, h3));
        }

        return minStack;
    }
}
