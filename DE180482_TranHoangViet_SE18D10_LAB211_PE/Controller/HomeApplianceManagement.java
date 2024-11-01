package DE180482_TranHoangViet_SE18D10_LAB211_PE.Controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import DE180482_TranHoangViet_SE18D10_LAB211_PE.Model.HomeAppliance;
import DE180482_TranHoangViet_SE18D10_LAB211_PE.Model.HomeApplianceList;
import DE180482_TranHoangViet_SE18D10_LAB211_PE.View.InputValid;

/**
 * HomeApplianceManagement
 */
public class HomeApplianceManagement {
    HomeApplianceList homeApplianceList = new HomeApplianceList();
    InputValid input = new InputValid();

    public void addNewHomeAppli() throws ParseException {
        System.out.println("----------Add new home appliance----------");
        while (true) {
            System.out.println("Enter name: ");
            String name = input.checkInputString();
            System.out.println("Enter brand: ");
            String brand = input.checkInputString();
            System.out.println("Enter date: ");
            Date purchaseDate = input.checkValidDate();
            System.out.println("Enter the power consumption in watts");
            double powerConsumption = input.checkInputDouble();
            System.out.println("Enter Warranty status of the appliance");
            String warrantyStatus = input.checkWarrantySt();
            homeApplianceList
                    .addHomeAppliance(new HomeAppliance(name, brand, purchaseDate, powerConsumption, warrantyStatus));
            if (input.checkInputYN()) {
                return;
            }
        }
    }

    public void updateHomeAppli() throws ParseException {

        System.out.println("----------Update information of a home appliance----------");
        System.out.println("Enter name: ");
        String name = input.checkInputString();
        HomeAppliance temp = homeApplianceList.searchHomeAppliance(name);
        if (temp == null) {
            System.out.println("Not exist: ");
            return;
        }
        System.out.println("Enter name: ");
        String nameU = input.checkInputString();
        System.out.println("Enter brand: ");
        String brand = input.checkInputString();
        System.out.println("Enter date: ");
        Date purchaseDate = input.checkValidDate();
        System.out.println("Enter the power consumption in watts: ");
        double powerConsumption = input.checkInputDouble();
        System.out.println("Enter Warranty status of the appliance: ");
        String warrantyStatus = input.checkWarrantySt();
        homeApplianceList.updateHomeAppliance(name,
                new HomeAppliance(nameU, brand, purchaseDate, powerConsumption, warrantyStatus));
        System.out.println("Update successful");
    }

    public void searchHomeAppliance() {
        System.out.println("----------Search home appliances----------");
        System.out.println("Enter name, brand, or warranty status: ");
        String search = input.checkInputString();
        ArrayList<HomeAppliance> temp = homeApplianceList.searchHomeApplianceList(search);
        if (temp.isEmpty()) {
            System.out.println("Is empty");
            return;
        } else {
            for (HomeAppliance homeAppliance : temp) {
                System.out.println(homeAppliance);
            }
        }
    }

    public void loadFromFile() throws ParseException {
        homeApplianceList.loadFromFile();
    }

    public void delHomeAppliance() {
        System.out.println("-----------Del----------");
        homeApplianceList.delHomeAppliance();
    }

    public void display() {
        System.out.println("-----------Display----------");
        for (HomeAppliance homeAppliance : homeApplianceList.getAppliances()) {
            System.out.println(homeAppliance);
        }
    }
}