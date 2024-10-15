package TranHoangViet_DE180482_SE18D10_week7.fraction.Model;

import java.util.ArrayList;

public class FractionList {
    ArrayList<Fraction> fractionList = new ArrayList<>();

    public ArrayList<Fraction> getFractionList() {
        return fractionList;
    }

    public void setFractionList(ArrayList<Fraction> fractionList) {
        this.fractionList = fractionList;
    }

    public void addFraction(Fraction fraction){
        fractionList.add(fraction);
    }
}
