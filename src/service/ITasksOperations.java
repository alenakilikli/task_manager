package service;

import entity.Task;

import java.util.List;

public interface ITasksOperations {

    void createTask();

    public List<Task> findAllNotCompletedTasks(List<Task> tasks);

    List<Task> findTasksByAssignedPerson(List<Task> tasks, String assignedPerson);

    public void findAllTasksToCompleteThisWeek();

    void deleteTaskByName(List<Task> tasks, String name);
}
