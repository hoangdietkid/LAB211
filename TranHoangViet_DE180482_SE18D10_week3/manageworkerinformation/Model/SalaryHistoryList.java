package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model;

import java.util.ArrayList;

public class SalaryHistoryList {
    private ArrayList<SalaryHistory> salaryList = new ArrayList<>();

    public ArrayList<SalaryHistory> getSalaryList() {
        return salaryList;
    }

    public void setSalaryList(ArrayList<SalaryHistory> salaryList) {
        this.salaryList = salaryList;
    }

    public void addSalaryHis(SalaryHistory salaryhis) {
        salaryList.add(salaryhis);
    }
}
