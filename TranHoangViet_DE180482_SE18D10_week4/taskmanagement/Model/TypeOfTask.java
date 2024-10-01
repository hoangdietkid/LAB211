package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.Model;

import java.util.HashMap;

public class TypeOfTask {
    private HashMap<Integer, String> typeOfTask = new HashMap<>();

    public TypeOfTask() {
        typeOfTask.put(1, "Code");
        typeOfTask.put(2, "Test");
        typeOfTask.put(3, "Design");
        typeOfTask.put(4, "Review");
    }

    public HashMap<Integer, String> getTypeOfTask() {
        return typeOfTask;
    }

    public void setTypeOfTask(HashMap<Integer, String> typeOfTask) {
        this.typeOfTask = typeOfTask;
    }

}