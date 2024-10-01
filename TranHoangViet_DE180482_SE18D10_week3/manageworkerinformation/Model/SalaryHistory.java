package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model;

public class SalaryHistory implements Comparable<SalaryHistory> {
    private String workerid;
    private double newsalary;
    private String name;
    private int age;
    private String status;
    private String date;

    public SalaryHistory(String workerid, double newsalary, String name, int age, String status, String date) {
        this.workerid = workerid;
        this.newsalary = newsalary;
        this.name = name;
        this.age = age;
        this.status = status;
        this.date = date;
    }

    public SalaryHistory() {
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid;
    }

    public double getNewsalary() {
        return newsalary;
    }

    public void setNewsalary(double newsalary) {
        this.newsalary = newsalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(SalaryHistory o) {
        return this.workerid.compareTo(o.getWorkerid());
    }

}
