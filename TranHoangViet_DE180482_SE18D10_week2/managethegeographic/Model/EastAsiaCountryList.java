package TranHoangViet_DE180482_SE18D10_week2.managethegeographic.Model;

import java.util.ArrayList;
import java.util.Collections;

public class EastAsiaCountryList {
    private ArrayList<EastAsiaCountry> list = new ArrayList<>();

    public ArrayList<EastAsiaCountry> getList() {
        return list;
    }

    public void setList(ArrayList<EastAsiaCountry> list) {
        this.list = list;
    }

    public void addCountryInformation(EastAsiaCountry country) {
        list.add(country);
    }

    public EastAsiaCountry getRecentlyEnteredInformation() {
        if (list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    public ArrayList<EastAsiaCountry> sortInformationByAscendingOrder() {
        Collections.sort(list, new EastAsiaCountry());
        return list;
    }

    public ArrayList<EastAsiaCountry> searchInformationByName(String name) {
        ArrayList<EastAsiaCountry> result = new ArrayList<>();
        name = name.toLowerCase();
        if (list.isEmpty())
            return null;
        for (EastAsiaCountry e : list) {
            if (e.getCountryName().toLowerCase().contains(name)) {
                result.add(e);
            }
        }
        return result;
    }

}
