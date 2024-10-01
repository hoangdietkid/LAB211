package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private int id;
    private int taskid;
    private String requirementName;
    private Date date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    public Task(int id, int taskid, String requirementName, Date date, double planFrom, double planTo,
            String assignee, String reviewer) {
        this.id = id;
        this.taskid = taskid;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public Task() {
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getRequiementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        TypeOfTask typetask = new TypeOfTask();
        System.out.printf("%-10s%15s%15s%15s%15s%15s%15s\n", id, requirementName,
                typetask.getTypeOfTask().get(this.taskid),
                simpleDateFormat.format(date), planTo - planFrom, assignee, reviewer);
    }

}
