package TranHoangViet_DE180482_SE18D10_week2.managedoctor.View;

public class Main {
    public static Menu menu = new Menu();
    public static ManageDoctor manageDoctor = new ManageDoctor();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageDoctor.addDoctor();
                    break;
                case 2:
                    manageDoctor.updateDoctor();
                    break;
                case 3:
                    manageDoctor.deleteDoctor();
                    break;
                case 4:
                    manageDoctor.searchDoctor();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
