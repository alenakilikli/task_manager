package service.impl;

import entity.Task;
import service.ITasksOperations;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.stream.Collectors;

//import static service.impl.ITaskWritingImpl.writeToFile;

public class ITaskOperationsImpl implements ITasksOperations {





    @Override
    public List<Task> findAllNotCompletedTasks(List<Task> tasks) {
        return tasks.stream().filter(t -> !t.isCompleted()).collect(Collectors.toList());
    }

    @Override
    public List<Task> findTasksByAssignedPerson(List<Task> tasks, String assignedPerson) {
        return tasks.stream().filter(t -> t.getAssignedPerson().equals(assignedPerson)).collect(Collectors.toList());

    }

    @Override
    public void findAllTasksToCompleteThisWeek() {

    }

    @Override
    public void deleteTaskByName(List<Task> tasks, String name) {
        tasks.removeIf(t -> t.equals(name));
    }
}
