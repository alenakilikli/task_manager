package entity;

import java.io.Serializable;

public class Task implements Serializable {

    static final long serialVersionUID = 1L;

    String name;
    boolean IsCompleted;
    String assignedPerson;
//    LocalDate localDate;
//    LocalDate completionDate;

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", IsCompleted=" + IsCompleted +
                ", assignedPerson='" + assignedPerson + '\'' +
//                ", localDate=" + localDate +
//                ", completionDate=" + completionDate +
                '}';
    }

    public Task(String name, boolean isCompleted, String assignedPerson) {
        this.name = name;
        IsCompleted = isCompleted;
        this.assignedPerson = assignedPerson;
//        this.localDate = localDate;
//        this.completionDate = completionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return IsCompleted;
    }

    public void setCompleted(boolean completed) {
        IsCompleted = completed;
    }

    public String getAssignedPerson() {
        return assignedPerson;
    }

    public void setAssignedPerson(String assignedPerson) {
        this.assignedPerson = assignedPerson;
    }

//    public LocalDate getLocalDate() {
//        return localDate;
//    }
//
//    public void setLocalDate(LocalDate localDate) {
//        this.localDate = localDate;
//    }
//
//    public LocalDate getCompletionDate() {
//        return completionDate;
//    }
//
//    public void setCompletionDate(LocalDate completionDate) {
//        this.completionDate = completionDate;
//    }
}
