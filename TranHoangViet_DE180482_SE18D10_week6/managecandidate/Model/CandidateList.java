package TranHoangViet_DE180482_SE18D10_week6.managecandidate.Model;

import java.util.ArrayList;

public class CandidateList {
    ArrayList<Candidate> candidateList = new ArrayList<>();

    public ArrayList<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(ArrayList<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public void addCandidate(Candidate c) {
        candidateList.add(c);
    }

    public void delCandidate(Candidate c) {
        candidateList.remove(c);
    }

    public void updateCandidate(String id, int type, Candidate candidate) {
        Candidate curCandidate = searchCandidatebyId(id, type);
        candidateList.set(candidateList.indexOf(curCandidate), candidate);
    }

    public ArrayList<Candidate> searchCandidatebyName(String name, int type) {
        ArrayList<Candidate> temp = new ArrayList<>();
        for (Candidate candidate : candidateList) {
            if (candidate.getFirstName().contains(name)
                    || candidate.getLastName().contains(name) && candidate.getTypeOfCandidate() == type) {
                temp.add(candidate);
            }
        }
        return temp;
    }

    public Candidate searchCandidatebyId(String id, int type) {
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateid().equals(id) && candidate.getTypeOfCandidate() == type) {
                return candidate;
            }
        }
        return null;
    }
}
