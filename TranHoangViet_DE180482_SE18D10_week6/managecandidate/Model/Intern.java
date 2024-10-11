package TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model;

import java.util.Date;

public class Intern extends Candidate {
    private String majors, semester, universityName;

    public Intern(String candidateid, String firstName, String lastName, String address, String phone, String email,
            Date birthDate, int typeOfCandidate, String majors, String semester, String universityName) {
        super(candidateid, firstName, lastName, address, phone, email, birthDate, typeOfCandidate);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern() {

    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

}
