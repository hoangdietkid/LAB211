package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model;

public class Worker {
    private String id;
    private String name;
    private int age;
    private String workLocation;
    private double salary;

    public Worker() {
    }

    public Worker(String id, String name, int age, String workLocation, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workLocation = workLocation;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
