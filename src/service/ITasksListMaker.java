package service;

import entity.Task;

import java.io.IOException;
import java.util.List;

public interface ITasksListMaker {

    public List<Task> putTaskToTheList(String str) throws IOException;

}
