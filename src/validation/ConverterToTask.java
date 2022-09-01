package validation;

import entity.Task;

import java.text.ParseException;
import java.time.LocalDate;

public class ConverterToTask {
    public static Task convertToTask(String line) throws ParseException {
        String[] p = line.split(" ");
        return new Task(p[0],  Boolean.parseBoolean(p[1]),p[2], LocalDate.parse(p[3]),LocalDate.parse(p[4]));

    }
}
