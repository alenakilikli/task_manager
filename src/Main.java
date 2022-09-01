import entity.Task;
import service.ITasksListMaker;
import service.ITasksOperations;
import service.impl.ITaskOperationsImpl;
import service.impl.ITasksListMakerImpl;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ITasksListMaker tasksListMaker = new ITasksListMakerImpl();
        List<Task> list = tasksListMaker.putTaskToTheList("tasksList/tasks/listOfTasks.tasks");
        System.out.println(list);

        ITasksOperations tasksOperations = new ITaskOperationsImpl();
        System.out.println(tasksOperations.findAllNotCompletedTasks(list));

    }
}