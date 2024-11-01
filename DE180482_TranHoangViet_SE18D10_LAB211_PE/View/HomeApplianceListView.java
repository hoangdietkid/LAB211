package DE180482_TranHoangViet_SE18D10_LAB211_PE.View;

import java.text.ParseException;

import DE180482_TranHoangViet_SE18D10_LAB211_PE.Controller.HomeApplianceManagement;

public class HomeApplianceListView {
    public static Menu menu = new Menu();
    public static HomeApplianceManagement applianceManagement = new HomeApplianceManagement();

    public static void main(String[] args) throws ParseException {
        applianceManagement.loadFromFile();
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    applianceManagement.addNewHomeAppli();
                    break;
                case 2:
                    applianceManagement.display();
                    break;
                case 3:
                    applianceManagement.updateHomeAppli();
                    break;
                case 4:
                    applianceManagement.searchHomeAppliance();
                    break;
                case 5:
                    applianceManagement.delHomeAppliance();
                    break;
                case 6:
                    System.out.println("Exit....");
                    System.exit(0);
                    break;
            }
        }
    }
}
