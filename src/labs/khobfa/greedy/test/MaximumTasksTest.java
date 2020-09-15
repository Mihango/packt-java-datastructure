package labs.khobfa.greedy.test;

import labs.khobfa.greedy.MaximumTasks;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaximumTasksTest {

    @Test
    public void getMaximumTasks_givenArrayOfTask_returnCorrectTotal() {
        // GIVEN
        int[] arr = { 4, 5, 3, 2, 1};
        MaximumTasks maximumTasks = new MaximumTasks();

        // WHEN
        int tasks = maximumTasks.calculate(arr, 10);

        // THEN
        assertThat(tasks, is(4));
    }

    @Test
    public void getMaximumTasks_givenNull_returnZero() {
        // GIVEN
        MaximumTasks maximumTasks = new MaximumTasks();

        // WHEN
        int tasks = maximumTasks.calculate(null, 10);

        // THEN
        assertThat(tasks, is(0));
    }

    @Test
    public void getMaximumTasks_givenEmptyArray_returnZero() {
        // GIVEN
        MaximumTasks maximumTasks = new MaximumTasks();

        // WHEN
        int tasks = maximumTasks.calculate(null, 10);

        // THEN
        assertThat(tasks, is(0));
    }

}