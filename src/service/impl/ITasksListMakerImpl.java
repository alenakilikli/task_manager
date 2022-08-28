package service.impl;

import entity.Task;
import service.ITasksListMaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static service.impl.ITaskFileCreatorImpl.convertToTask;

public class ITasksListMakerImpl implements ITasksListMaker {

    @Override
    public List<Task> putTaskToTheList(String str) throws IOException {
        List<Task> res;
        try (BufferedReader br = new BufferedReader(new FileReader(str))) {
            res = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                Task task = convertToTask(line);
                res.add(task);
            }
        }
        return res;
    }




}
