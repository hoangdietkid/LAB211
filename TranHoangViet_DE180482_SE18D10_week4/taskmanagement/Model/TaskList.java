package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.Model;

import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> taskArrayList = new ArrayList<>();

    public TaskList() {
    }

    public TaskList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }

    public void addTask(Task task) {
        taskArrayList.add(task);
    }

    public boolean delTask(int id) {
        for (Task task : taskArrayList) {
            if (task.getId() == id) {
                taskArrayList.remove(task);
            }
        }
        return false;
    }

}
