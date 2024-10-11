package TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model;

import java.util.Date;

public class Fresher extends Candidate {
    private Date graduation_date;
    private String graduation_rank, education;

    public Fresher() {
    }

    public Fresher(String candidateid, String firstName, String lastName, String address, String phone, String email,
            Date birthDate, int typeOfCandidate, Date graduation_date, String graduation_rank, String education) {
        super(candidateid, firstName, lastName, address, phone, email, birthDate, typeOfCandidate);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public Date getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(Date graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
