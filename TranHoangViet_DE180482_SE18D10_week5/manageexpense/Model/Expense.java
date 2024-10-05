package TranHoangViet_DE180482_SE18D10_week5.manageexpense.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
    private int id;
    private Date date;
    private double number;
    private String content;

    public Expense() {
    }

    public Expense(int id, Date date, double number, String content) {
        this.id = id;
        this.date = date;
        this.number = number;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void dislay() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.printf("%-7d%-20s%-20.0f%-20s\n", id, simpleDateFormat.format(date), number, content);

    }
}
