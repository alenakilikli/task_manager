package service.impl;

import entity.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void writeToFile(String string, String filepath) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filepath,true))) {
            pw.println(string);
          //  pw.write(string);

        }
    }
    public static Task convertToTask(String line) {
        String[] p = line.split(" ");
        return new Task(p[0],  Boolean.parseBoolean(p[1]),p[2]);
                //,LocalDate.parse(p[3]),LocalDate.parse(p[4])

    }

    public static List<String> readFromTasksFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> res = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
            return res;
        }
    }


}
