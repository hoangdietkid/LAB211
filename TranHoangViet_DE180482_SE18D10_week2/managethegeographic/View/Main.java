package TranHoangViet_DE180482_SE18D10_week2.managethegeographic.View;

public class Main {
    public static Menu menu = new Menu();
    public static ManageEastAsiaCountries manageEastAsiaCountries = new ManageEastAsiaCountries();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    manageEastAsiaCountries.addCountryInformation();
                    break;
                case 2:
                    manageEastAsiaCountries.printRecentlyEnteredInformation();
                    break;
                case 3:
                    manageEastAsiaCountries.searchByName();
                    break;
                case 4:
                    manageEastAsiaCountries.printCountry();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
