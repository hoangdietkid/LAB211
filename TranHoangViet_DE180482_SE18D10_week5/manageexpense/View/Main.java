package TranHoangViet_DE180482_SE18D10_week5.manageexpense.View;

import java.text.ParseException;

public class Main {
    public static Menu menu = new Menu();
    public static ManageExpense manageExpense = new ManageExpense();

    public static void main(String[] args) throws ParseException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageExpense.addExpense();
                    break;
                case 2:
                    manageExpense.delExpense();
                    break;
                case 3:
                    manageExpense.displayExpense();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
