package TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
    protected String candidateid, firstName, lastName, address, phone, email;
    protected Date birthDate;
    protected int typeOfCandidate;

    public Candidate() {
    }

    public Candidate(String candidateid, String firstName, String lastName, String address, String phone, String email,
            Date birthDate, int typeOfCandidate) {
        this.candidateid = candidateid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.typeOfCandidate = typeOfCandidate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTypeOfCandidate() {
        return typeOfCandidate;
    }

    public void setTypeOfCandidate(int typeOfCandidate) {
        this.typeOfCandidate = typeOfCandidate;
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return this.firstName + this.lastName + "|" + sdf.format(this.birthDate) + "|"
                + this.address + "|" + this.phone + "|" + this.email + "|"
                + this.typeOfCandidate;
    }
}
