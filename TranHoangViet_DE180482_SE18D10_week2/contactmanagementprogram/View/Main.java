package TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.View;

public class Main {
    public static Menu menu = new Menu();
    public static ManageContact manageContact = new ManageContact();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageContact.addContact();
                    break;
                case 2:
                    manageContact.display();
                    break;
                case 3:
                    manageContact.delContact();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
