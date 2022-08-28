package validation;

import entity.Task;

import java.util.List;

public class UniquenessValidator {
    public boolean checkUniqeness(List<Task> tasks,String name) {
        for (Task task:tasks){
            if (task.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
}
