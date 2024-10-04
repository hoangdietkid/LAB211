package TranHoangViet_DE180482_SE18D10_week5.managementstudent.Model;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(Student st) {
        studentList.add(st);
    }

    public ArrayList<Student> searchAndSortStudent(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getStudentName().contains(name)) {
                students.add(student);
            }
        }
        Collections.sort(students, (o1, o2) -> o1.getStudentName().compareTo(o2.getStudentName()));
        return students;
    }

    public ArrayList<Student> searchStudentId(String id) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                students.add(student);
            }
        }
        return students;
    }

    public void delStudent(Student student) {
        studentList.remove(student);
    }
}
