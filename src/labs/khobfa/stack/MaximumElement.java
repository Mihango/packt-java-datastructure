package labs.khobfa.stack;

import java.util.Stack;

/**
 * Hackerrank question
 */
public class MaximumElement {

    Stack<Integer> data = new Stack<>();
    Stack<Integer> maxima = new Stack<>();

    public void add(int value) {
        data.add(value);

        if (maxima.size() > 0) {
            int max = maxima.peek();
            maxima.add(Math.max(max, value));
        } else {
            maxima.add(value);
        }
    }

    private int pop() {
        int value = data.pop();
        if (value == maxima.peek()) maxima.pop();
        return value;
    }

    public int max() {
        return maxima.peek();
    }

    /**
     * @param commands if command is
     *                 1: add a value
     *                 2: pop
     *                 3: print max
     */
    public void process(int[][] commands) {
        for (int[] arr : commands) {
            int command = arr[0];
            switch (command) {
                case 1:
                    add(arr[1]);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    System.out.println(max());
            }
        }
    }
}
