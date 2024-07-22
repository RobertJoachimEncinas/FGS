package MVC.src.Model;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<String> tasks;
    private int current;

    public TaskList() {
        this.tasks = new ArrayList<>();
        this.current = 0;
    }

    public String getTasks(int index) {
        return tasks.get(index);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    public int getLength() {
        return this.tasks.size();
    }

    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int i) {
        this.current = i;
    }

    public void prev() {
        this.current--;
    }

    public void next() {
        this.current++;
    }
}

