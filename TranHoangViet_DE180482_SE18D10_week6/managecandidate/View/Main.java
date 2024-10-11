package TranHoangViet_DE180482_SE18D10_week6.managecandidate.View;

import java.text.ParseException;

public class Main {
    public static Menu menu = new Menu();
    public static ManageCandidate manageCandidate = new ManageCandidate();
    static String[] sub = { "EXPERIENCE CANDIDATE", "FRESHER CANDIDATE", "INTERN CANDIDATE" };

    public static void submenuExp(int type) throws ParseException {
        System.out.println(sub[type]);
        while (true) {
            int choice = menu.submenu();
            switch (choice) {
                case 1:
                    manageCandidate.addCandidate(type);
                    break;
                case 2:
                    manageCandidate.updateCandidate(type);
                    break;
                case 3:
                    manageCandidate.delCandidate(type);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    submenuExp(0);
                    break;
                case 2:
                    submenuExp(1);
                    break;
                case 3:
                    submenuExp(2);
                    break;
                case 4:
                    manageCandidate.searchCandidate();
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        }
    }
}
