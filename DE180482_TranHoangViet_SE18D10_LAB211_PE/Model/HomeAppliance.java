package DE180482_TranHoangViet_SE18D10_LAB211_PE.Model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class HomeAppliance {
    private String name;
    private String brand;
    private Date purchaseDate;
    private double powerConsumption;
    private String warrantyStatus;
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdfy = new SimpleDateFormat("yyyy-MM-dd");

    public HomeAppliance() {

    }

    public HomeAppliance(String name, String brand, Date purchaseDate, double powerConsumption, String warrantyStatus) {
        this.name = name;
        this.brand = brand;
        this.purchaseDate = purchaseDate;
        this.powerConsumption = powerConsumption;
        this.warrantyStatus = warrantyStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWarrantyStatus() {
        return warrantyStatus;
    }

    public void setWarrantyStatus(String warrantyStatus) {
        this.warrantyStatus = warrantyStatus;
    }

    public int getAge() {
        int oldY = Integer.parseInt(sdf.format(purchaseDate).substring(6));
        int nowY = Integer.parseInt(sdfy.format(LocalDate.now()).substring(0, 3));
        return nowY - oldY;
    }

    @Override
    public String toString() {
        return name + ", " + brand + ", " + sdf.format(purchaseDate)
                + ", " + powerConsumption + ", " + warrantyStatus;
    }

}
