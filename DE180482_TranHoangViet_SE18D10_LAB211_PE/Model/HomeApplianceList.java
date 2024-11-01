package DE180482_TranHoangViet_SE18D10_LAB211_PE.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HomeApplianceList {
    ArrayList<HomeAppliance> appliances = new ArrayList<>();

    public HomeApplianceList() {
    }

    public HomeApplianceList(ArrayList<HomeAppliance> appliances) {
        this.appliances = appliances;
    }

    public ArrayList<HomeAppliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(ArrayList<HomeAppliance> appliances) {
        this.appliances = appliances;
    }

    public void loadFromFile() throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            BufferedReader br = new BufferedReader(new FileReader("home_appliances.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (temp.length == 5) {
                    String name = temp[0];
                    String brand = temp[1];
                    Date purchaseDate = sd.parse(temp[2]);
                    double powerConsumption = Double.parseDouble(temp[3]);
                    String warrantyStatus = temp[4];
                    appliances.add(new HomeAppliance(name, brand, purchaseDate, powerConsumption, warrantyStatus));
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void addHomeAppliance(HomeAppliance H) {
        appliances.add(H);
    }

    public void delHomeAppliance() {
        for (HomeAppliance homeAppliance : appliances) {
            if (homeAppliance.getAge() > 10) {
                appliances.remove(homeAppliance);
            }
        }
        
    }

    public void updateHomeAppliance(String name, HomeAppliance newHomeAppliance) {
        int index = 0;
        for (HomeAppliance homeAppliance : appliances) {
            if (homeAppliance.getName().equals(name)) {
                appliances.set(index, newHomeAppliance);
            }
            index++;
        }
    }

    public HomeAppliance searchHomeAppliance(String search) {
        for (HomeAppliance homeAppliance : appliances) {
            if (homeAppliance.getName().equals(search)) {
                return homeAppliance;
            }
        }
        return null;
    }

    public ArrayList<HomeAppliance> searchHomeApplianceList(String search) {
        ArrayList<HomeAppliance> temp = new ArrayList<>();
        for (HomeAppliance homeAppliance : appliances) {
            if (homeAppliance.getName().contains(search) || homeAppliance.getBrand().contains(search)
                    || homeAppliance.getWarrantyStatus().equals(search)) {
                temp.add(homeAppliance);
            }
        }
        return temp;
    }
    
}
