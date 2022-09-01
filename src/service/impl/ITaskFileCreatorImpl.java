package service.impl;

import entity.Task;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static validation.ConverterToTask.convertToTask;
import static validation.UniquenessValidator.checkUniqeness;

public class ITaskFileCreatorImpl {

    public static String createFileWithTask(Task task) throws IOException {
        File baseDir = new File("tasksList/");
        if (!baseDir.exists()) {
            baseDir.mkdir();
        }
        File file = new File(baseDir, task.getName() + ".task");
        if (!file.exists()) {
            file.createNewFile();

        }
        return file.getPath();
    }

    public static void writeToFile(String string, String filepath) throws IOException, ParseException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filepath,true))) {
            pw.println(string);
        }
    }


    public static List<Task> readFromTasksFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> res = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
            return res.stream().map(t-> {
                try {
                    return convertToTask(t);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toList());
        }
    }


}
