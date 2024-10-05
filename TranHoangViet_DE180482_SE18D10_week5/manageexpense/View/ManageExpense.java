package TranHoangViet_DE180482_SE18D10_week5.manageexpense.View;

import java.text.ParseException;
import java.util.Date;

import TranHoangViet_DE180482_SE18D10_week5.manageexpense.Model.Expense;
import TranHoangViet_DE180482_SE18D10_week5.manageexpense.Model.ExpenseList;

public class ManageExpense {
    ExpenseList expenseList = new ExpenseList();
    InputValid input = new InputValid();

    public void addExpense() throws ParseException {
        while (true) {
            int id;
            if (expenseList.getExpenseList().size() == 0) {
                id = 1;
            } else {
                id = expenseList.getExpenseList().get(expenseList.getExpenseList().size() - 1).getId() + 1;
            }
            System.out.println("Enter date: ");
            Date date = input.checkValidDate();
            System.out.println("Enter Amount: ");
            double number = input.checkInputDouble();
            System.out.println("Enter Content: ");
            String content = input.checkInputString();
            expenseList.addExpense(new Expense(id, date, number, content));
            System.out.println("Add successful");
            if (input.checkInputYN()) {
                return;
            }
        }
    }

    public void delExpense() {
        System.out.println("Enter id: ");
        int id = input.checkInputInt();
        if (expenseList.searchExpense(id) != null) {
            expenseList.delExpense(expenseList.searchExpense(id));
            System.out.println("Successful.");
        } else {
            System.out.println("Id not found");
        }
    }

    public void displayExpense() {
        if (expenseList.getExpenseList().isEmpty()) {
            System.out.println("List empty");
            return;
        }
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (Expense expense : expenseList.getExpenseList()) {
            expense.dislay();
        }
        System.out.printf("Total :%-20.0f\n", expenseList.getAmount());

    }
}
