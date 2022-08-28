package entity;

import java.util.List;

public class TasksList {
    Task task;
    List<Task>list;

    @Override
    public String toString() {
        return "TasksList{" +
                "tasksList=" + task +
                '}';
    }

    public TasksList(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
