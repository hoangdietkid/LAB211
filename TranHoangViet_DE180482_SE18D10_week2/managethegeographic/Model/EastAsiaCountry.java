package TranHoangViet_DE180482_SE18D10_week2.managethegeographic.Model;

/**
 * EastAsiaCountry
 */
public class EastAsiaCountry extends Country {
    private String countryTerrain;

    public EastAsiaCountry() {

    }

    public EastAsiaCountry(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n", this.countryCode,
                this.countryName, this.totalArea, this.countryTerrain);
    }
}