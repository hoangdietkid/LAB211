package TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model;

import java.util.Date;

public class Experience extends Candidate {
    private String  proSkill;
    private int explnYear;


    public Experience(String candidateid, String firstName, String lastName, String address, String phone, String email,
            Date birthDate, int typeOfCandidate, int explnYear, String proSkill) {
        super(candidateid, firstName, lastName, address, phone, email, birthDate, typeOfCandidate);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public Experience() {
    }

    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

}
