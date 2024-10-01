package TranHoangViet_DE180482_SE18D10_week2.managedoctor.View;

import java.util.ArrayList;

import TranHoangViet_DE180482_SE18D10_week2.managedoctor.Control.Doctor;
import TranHoangViet_DE180482_SE18D10_week2.managedoctor.Control.DoctorList;

/**
 * ManageDoctor
 */
public class ManageDoctor {
    public static InputValid input = new InputValid();
    public static DoctorList doctorList = new DoctorList();

    public void addDoctor() {
        while (true) {

            System.out.print("Enter code: ");
            String code = input.checkInputString();
            if (!input.checkCodeExist(doctorList.getDoctorList(), code)) {
                System.err.println("Code exist.");
                return;
            }
            System.out.print("Enter name: ");
            String name = input.checkInputString();
            System.out.print("Enter specialization: ");
            String specialization = input.checkInputString();
            System.out.print("Enter availability: ");
            int availability = input.checkInputInt();
            if (!input.checkDuplicate(doctorList.getDoctorList(), code, name, specialization, availability)) {
                System.err.println("Duplicate.");
                return;
            }
            Doctor newDoctor = new Doctor(code, name, specialization, availability);
            doctorList.addDoctor(newDoctor);
            System.err.println("Add successful.");
            if (input.checkInputYN()) {
                return;
            }
        }
    }

    public void updateDoctor() {
        System.out.print("Enter code: ");
        String code = input.checkInputString();
        if (input.checkCodeExist(doctorList.getDoctorList(), code)) {
            System.err.println("Not found doctor");
            return;
        }
        System.out.print("Enter code: ");
        String codeUpdate = input.checkInputString();
        Doctor doctor = getDoctorByCode(code);
        System.out.print("Enter name: ");
        String name = input.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = input.checkInputString();
        System.out.print("Enter availability: ");
        int availability = input.checkInputInt();
        if (!input.checkChangeInfo(doctor, code, name, specialization, availability)) {
            System.err.println("No change");
            return;
        }
        Doctor newDoctor = new Doctor(codeUpdate, name, specialization, availability);
        doctorList.updateDoctor(newDoctor, doctor);
        System.err.println("Update successful");
    }

    public void deleteDoctor() {
        System.out.print("Enter code: ");
        String code = input.checkInputString();
        Doctor doctor = getDoctorByCode(code);
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            doctorList.delDoctor(doctor);
        }
        System.err.println("Delete successful.");
    }

    public void searchDoctor() {
        System.out.print("Enter name: ");
        String nameSearch = input.checkInputString();
        ArrayList<Doctor> listFoundByName = doctorList.searchDoctor(nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }

    public static Doctor getDoctorByCode(String code) {
        ArrayList<Doctor> ld = doctorList.getDoctorList();
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

}