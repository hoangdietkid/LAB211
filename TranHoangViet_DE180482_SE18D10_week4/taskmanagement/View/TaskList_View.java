package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.View;

import java.text.ParseException;
import java.util.Date;

import TranHoangViet_DE180482_SE18D10_week4.taskmanagement.Model.Task;
import TranHoangViet_DE180482_SE18D10_week4.taskmanagement.Model.TaskList;

public class TaskList_View {
    TaskList taskList = new TaskList();
    InputValid inputValid = new InputValid();

    public void addTask() throws ParseException {
        System.out.println("------------Add Task---------------");
        System.out.println("Requirement Name: ");
        String requirementName = inputValid.checkInputString();
        System.out.println("Task type: ");
        int taskTypeId = inputValid.checkLimitInput(1, 4);
        System.out.println("Date: ");
        Date date = inputValid.checkValidDate();
        System.out.println("From: ");
        double planFrom = inputValid.inputLimitDouble(8, 17.5);
        double planTo;
        System.out.println("To: ");
        while (true) {
            planTo = inputValid.inputLimitDouble(planFrom, 17.5);
            if (planTo <= planFrom) {
                System.out.println("Plan to must be greater than plan from");
                System.out.println("Enter again: ");
            }
            if (planTo > planFrom) {
                break;
            }
        }
        System.out.println("Assignee: ");
        String assignee = inputValid.checkInputString();
        System.out.println("Reviewer: ");
        String reviewer = inputValid.checkInputString();
        int id;
        if (taskList.getTaskArrayList().size() == 0) {
            id = 1;
        } else {
            id = taskList.getTaskArrayList().get(taskList.getTaskArrayList().size() - 1).getId() + 1;
        }
        Task task = new Task(id, taskTypeId, requirementName, date, planFrom, planTo,
                assignee, reviewer);
        taskList.addTask(task);
    }

    public void showTaskView() {
        System.out.println("------------------Task----------------");
        System.out.printf("%-10s%15s%15s%15s%15s%15s%15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee",
                "Reviewer");
        for (Task task : taskList.getTaskArrayList()) {
            task.display();
        }
    }

    public void delTask() {
        System.out.println("---------Del Task-------");
        System.out.println("Id: ");
        int id = inputValid.checkInputInt();
        if (taskList.delTask(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("Id not be exist");
        }
    }
}
