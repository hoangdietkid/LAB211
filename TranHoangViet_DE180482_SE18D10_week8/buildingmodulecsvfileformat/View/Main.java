package TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.View;

import TranHoangViet_DE180482_SE18D10_week8.buildingmodulecsvfileformat.Model.ManagePerson;

public class Main {
    public static ManagePerson managePerson = new ManagePerson();
    public static Menu menu = new Menu();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    managePerson.importFile();
                    break;
                case 2:
                    managePerson.formatAddress();
                    break;
                case 3:
                    managePerson.formatName();
                    break;
                case 4:
                    managePerson.exportFile();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
