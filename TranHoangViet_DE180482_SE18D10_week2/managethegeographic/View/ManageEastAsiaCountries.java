package TranHoangViet_DE180482_SE18D10_week2.managethegeographic.View;

import java.util.ArrayList;

import TranHoangViet_DE180482_SE18D10_week2.managethegeographic.Model.EastAsiaCountry;
import TranHoangViet_DE180482_SE18D10_week2.managethegeographic.Model.EastAsiaCountryList;

public class ManageEastAsiaCountries {
    EastAsiaCountryList eastAsiaCountryList = new EastAsiaCountryList();
    InputValid input = new InputValid();

    public void addCountryInformation() {
        while (true) {
            System.out.println("Enter code of country: ");
            String countryCode = input.checkInputString();
            System.out.println("Enter name of country");
            String countryName = input.checkInputString();
            System.out.println("Enter total area: ");
            float countryArea = input.checkInputFloat();
            System.out.println("Enter terrain of country: ");
            String countryTerrain = input.checkInputString();
            EastAsiaCountry temp = new EastAsiaCountry(countryCode, countryName, countryArea, countryTerrain);
            eastAsiaCountryList.addCountryInformation(temp);
            boolean check = input.checkInputYN();
            if (check)
                return;
        }
    }

    public void printCountry() {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        ArrayList<EastAsiaCountry> lc = eastAsiaCountryList.sortInformationByAscendingOrder();
        for (EastAsiaCountry list : lc) {
            list.display();
        }
    }

    public void printRecentlyEnteredInformation() {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        EastAsiaCountry recently = eastAsiaCountryList.getRecentlyEnteredInformation();
        recently.display();
    }

    public void searchByName() {
        System.out.println("Enter the name you want to search for: ");
        String result = input.checkInputString();

        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        ArrayList<EastAsiaCountry> search = eastAsiaCountryList.searchInformationByName(result);

        for (EastAsiaCountry list : search) {
            list.display();
        }
    }
}
