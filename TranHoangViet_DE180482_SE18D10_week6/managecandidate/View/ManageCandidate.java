package TranHoangViet_DE180482_SE18D10_week6.managecandidate.View;

import java.text.ParseException;
import java.util.Date;

import TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model.Candidate;
import TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model.CandidateList;
import TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model.Experience;
import TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model.Fresher;
import TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model.Intern;

public class ManageCandidate {
    InputValid input = new InputValid();
    CandidateList candidateList = new CandidateList();

    public void addCandidate(int type) throws ParseException {
        while (true) {
            System.out.println("Enter id: ");
            String id;
            while (true) {
                id = input.checkInputString();
                if (candidateList.searchCandidatebyId(id, type) == null) {
                    break;
                } else {
                    System.out.println("ID exist");
                    System.out.println("Enter again: ");
                }
            }
            System.out.println("Enter first name: ");
            String firstName = input.checkInputString();
            System.out.println("Enter last name:");
            String lastName = input.checkInputString();
            System.out.println("Enter birth day:");
            Date birthDate = input.checkValidDate();
            System.out.println("Enter address: ");
            String address = input.checkInputString();
            System.out.println("Enter Phone:");
            String phone = input.checkPhone();
            System.out.println("Enter email:");
            String email = input.checkInputEmail();
            if (type == 0) {
                System.out.println("Enter year of experience:");
                int explnYear = input.checkLimitInput(0, 100);
                System.out.println("Enter Professional Skill: ");
                String proSkill = input.checkInputString();
                candidateList.addCandidate(new Experience(id, firstName, lastName, address, phone, email,
                        birthDate, type, explnYear, proSkill));
                System.out.println("Add successful");
            }
            if (type == 1) {
                System.out.println("Enter graduated time");
                Date Graduation_date = input.checkValidDate();
                System.out.println("Enter Rank of Graduation:");
                String Graduation_rank = input.checkRank();
                System.out.println("Enter University: ");
                String education = input.checkInputString();
                candidateList.addCandidate(new Fresher(id, firstName, lastName, address, phone, email, birthDate, type,
                        Graduation_date, Graduation_rank, education));
                System.out.println("Add successful");
            }
            if (type == 2) {
                System.out.println("Enter Majors:");
                String major = input.checkInputString();
                System.out.println("Enter Semester:");
                String semester = input.checkInputString();
                System.out.println("Enter University name");
                String education = input.checkInputString();
                candidateList.addCandidate(new Intern(id, firstName, lastName, address, phone, email, birthDate, type,
                        major, semester, education));
                System.out.println("Add successful");

            }
            if (input.checkInputYN()) {
                return;
            }
        }
    }

    public void updateCandidate(int type) throws ParseException {
        System.out.println("Enter id: ");
        String id = input.checkInputString();
        Candidate candidate = candidateList.searchCandidatebyId(id, type);
        if (candidate == null) {
            System.out.println("Not found");
        } else {
            System.out.println("Enter id: ");
            String newid;
            while (true) {
                newid = input.checkInputString();
                if (candidateList.searchCandidatebyId(newid, type) == null) {
                    break;
                }
                if (candidateList.searchCandidatebyId(newid, type).getCandidateid() == newid) {
                    break;
                } else {
                    System.out.println("ID exist");
                    System.out.println("Enter again: ");
                }
            }
            System.out.println("Enter first name: ");
            String firstName = input.checkInputString();
            System.out.println("Enter last name:");
            String lastName = input.checkInputString();
            System.out.println("Enter birth day:");
            Date birthDate = input.checkValidDate();
            System.out.println("Enter address: ");
            String address = input.checkInputString();
            System.out.println("Enter Phone:");
            String phone = input.checkPhone();
            System.out.println("Enter email:");
            String email = input.checkInputEmail();
            if (type == 0) {
                System.out.println("Enter year of experience:");
                int explnYear = input.checkLimitInput(0, 100);
                System.out.println("Enter Professional Skill: ");
                String proSkill = input.checkInputString();
                Candidate newExp = new Experience(newid, firstName, lastName, address, phone, email, birthDate, type,
                        explnYear, proSkill);
                if (candidateList.searchCandidatebyId(id, type).equals(newExp)) {
                    System.out.println("No change");
                    return;
                }
                candidateList.updateCandidate(id, type, newExp);
                System.out.println("Update successful");
            }
            if (type == 1) {
                System.out.println("Enter graduated time");
                Date Graduation_date = input.checkValidDate();
                System.out.println("Enter Rank of Graduation:");
                String Graduation_rank = input.checkRank();
                System.out.println("Enter University: ");
                String education = input.checkInputString();
                Candidate newFre = new Fresher(newid, firstName, lastName, address, phone, email,
                        birthDate, type, Graduation_date, Graduation_rank, education);
                if (candidateList.searchCandidatebyId(id, type).equals(newFre)) {
                    System.out.println("No change");
                    return;
                }
                candidateList.updateCandidate(id, type, newFre);
                System.out.println("Update successful");
            }
            if (type == 2) {
                System.out.println("Enter Majors:");
                String major = input.checkInputString();
                System.out.println("Enter Semester:");
                String semester = input.checkInputString();
                System.out.println("Enter University name");
                String education = input.checkInputString();
                Candidate newInr = new Intern(newid, firstName, lastName, address, phone, email,
                        birthDate, type, major, semester, education);
                if (candidateList.searchCandidatebyId(id, type).equals(newInr)) {
                    System.out.println("No change");
                    return;
                }
                candidateList.updateCandidate(id, type, newInr);
                System.out.println("Update successful");

            }
        }
    }

    public void delCandidate(int type) {
        System.out.println("Enter id: ");
        String id;
        Candidate candidate;
        while (true) {
            id = input.checkInputString();
            candidate = candidateList.searchCandidatebyId(id, type);
            if (candidate == null) {
                System.out.println("Not found");
                System.out.println("Enter again: ");
            } else {
                break;
            }
        }
        candidateList.delCandidate(candidate);
        System.out.println("Delete successful");
    }

    public void disListOfCandidate() {
        System.out.println("List of candidate:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate ca : candidateList.getCandidateList()) {
            if (ca instanceof Experience) {
                System.out.println(ca.getFirstName() + " " + ca.getLastName());
            }
        }
        System.out.println("===========FRESHER CANDIDATE============");
        for (Candidate ca : candidateList.getCandidateList()) {
            if (ca instanceof Fresher) {
                System.out.println(ca.getFirstName() + " " + ca.getLastName());
            }
        }
        System.out.println("===========INTERN CANDIDATE============");
        for (Candidate ca : candidateList.getCandidateList()) {
            if (ca instanceof Intern) {
                System.out.println(ca.getFirstName() + " " + ca.getLastName());
            }
        }
    }

    public void searchCandidate() {
        disListOfCandidate();
        System.out.println("Enter Name: ");
        String name = input.checkInputString();
        System.out.println("Input type of candidate:");
        int type = input.checkLimitInput(0, 2);
        if (type == 0) {
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Experience) {
                    if (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name)) {
                        candidate.display();
                    }
                }
            }
        }
        if (type == 1) {
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Fresher) {
                    if (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name)) {
                        candidate.display();
                    }
                }
            }
        }
        if (type == 2) {
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Intern) {
                    if (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name)) {
                        candidate.display();
                    }
                }
            }
        }
    }
}
