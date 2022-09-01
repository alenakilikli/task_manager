package validation;

import entity.Task;

public class UniquenessValidator {
    public static boolean checkUniqeness(Task task, String name) {
        if (task.getName().equals(name)) {
            return false;
        }
        return true;
    }
}
