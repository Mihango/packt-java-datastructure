package labs.khobfa.greedy;

public class Task {
    int start;
    int finish;

    public Task(int start, int finish) {
        this.finish = finish;
        this.start = start;
    }

    @Override
    public String toString() {
        return "Task{" +
                "start=" + start +
                ", finish=" + finish +
                '}';
    }
}
