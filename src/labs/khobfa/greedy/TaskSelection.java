package labs.khobfa.greedy;

import java.util.ArrayList;
import java.util.List;

public class TaskSelection {

    public List<Task> select(List<Task> tasks) {
        System.out.println(tasks.size());
        List<Task> selected = new ArrayList<>();
        tasks.sort((t1, t2) -> Integer.signum(t1.finish - t2.finish));

        System.out.println(tasks.toString());

        if (tasks.size() > 0) selected.add(tasks.get(0));

        for (int i = 1; i < tasks.size(); i++) {
            if (tasks.get(i).start >= selected.get(selected.size() - 1).finish)
                selected.add(tasks.get(i));
        }

        return selected;
    }

    public static void main(String[] args) {
        TaskSelection taskSelection = new TaskSelection();
        List<Task> arr = new ArrayList<>();
        arr.add(new Task(1, 3));
        arr.add(new Task(2, 3));
        arr.add(new Task(3, 5));
        List<Task> selected = taskSelection.select(arr);

        for (Task t : selected) System.out.println("Task >>>> start: " + t.start + " finish: " + t.finish);
    }
}
