package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.View;

import java.text.ParseException;

public class Main {
    public static ManageSalary manageSalary = new ManageSalary();
    public static Menu menu = new Menu();

    public static void main(String[] args) throws ParseException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageSalary.addWorker();
                    break;
                case 2:
                    manageSalary.changeSalary(true);
                    break;
                case 3:
                    manageSalary.changeSalary(false);
                    break;
                case 4:
                    manageSalary.printListHistory();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
