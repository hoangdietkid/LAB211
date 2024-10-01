package TranHoangViet_DE180482_SE18D10_week2.managedoctor.Control;

import java.util.ArrayList;

public class DoctorList {
    private ArrayList<Doctor> doctorList = new ArrayList<>();

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public void updateDoctor(Doctor newdoctor, Doctor doctor) {
        doctor.setCode(newdoctor.getCode());
        doctor.setName(newdoctor.getName());
        doctor.setAvailability(newdoctor.getAvailability());
        doctor.setSpecialization(newdoctor.getSpecialization());
    }

    public ArrayList<Doctor> searchDoctor(String id) {
        ArrayList<Doctor> list = new ArrayList<>();
        for (Doctor doctor : doctorList) {
            if (doctor.getCode().contains(id)) {
                list.add(doctor);
            }
        }
        return list;
    }

    public void delDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }

}
