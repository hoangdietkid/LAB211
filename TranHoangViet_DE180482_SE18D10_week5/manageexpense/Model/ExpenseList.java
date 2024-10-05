package TranHoangViet_DE180482_SE18D10_week5.manageexpense.Model;

import java.util.ArrayList;

public class ExpenseList {
    ArrayList<Expense> expenseList = new ArrayList<>();

    public ExpenseList() {
    }

    public ArrayList<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(ArrayList<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }

    public void delExpense(Expense expense) {
        expenseList.remove(expense);
    }

    public Expense searchExpense(int id) {
        for (Expense expense : expenseList) {
            if (expense.getId() == id) {
                return expense;
            }
        }
        return null;
    }

    public double getAmount() {
        double amount = 0;
        for (Expense expense : expenseList) {
            amount += expense.getNumber();
        }
        return amount;
    }
}
