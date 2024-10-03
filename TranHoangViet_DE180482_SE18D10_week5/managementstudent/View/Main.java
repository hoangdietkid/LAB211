package TranHoangViet_DE180482_SE18D10_week5.managementstudent.View;

public class Main {
    public static Menu menu = new Menu();
    public static ManageStudent manageStudent = new ManageStudent();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageStudent.creatStudent();
                    break;
                case 2:
                    manageStudent.findAndSort();
                    break;
                case 3:
                    manageStudent.updateOrDelStudent();
                    break;
                case 4:
                    manageStudent.report();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
