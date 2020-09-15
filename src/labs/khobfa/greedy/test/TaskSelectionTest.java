package labs.khobfa.greedy.test;

import labs.khobfa.greedy.Task;
import labs.khobfa.greedy.TaskSelection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TaskSelectionTest {

    @Test
    public void givenTask_SelectMany() {
        //GIVEN
        TaskSelection taskSelection = new TaskSelection();

        // WHEN
        List<Task> tasks = taskSelection.select(createTasks());

        // THEN
//        assertThat(tasks, (new Task(1, 3), new Task(3, 5)));
        assertEquals(2, tasks.size());
    }

    private List<Task> createTasks() {
        List<Task> arr = new ArrayList<>();
        arr.add(new Task(1, 3));
        arr.add(new Task(2, 3));
        arr.add(new Task(3, 5));
        return arr;
    }
}