package TranHoangViet_DE180482_SE18D10_week5.managementstudent.View;

import java.util.ArrayList;
import java.util.HashMap;

import TranHoangViet_DE180482_SE18D10_week5.managementstudent.Model.Student;
import TranHoangViet_DE180482_SE18D10_week5.managementstudent.Model.StudentList;

public class ManageStudent {
    InputValid input = new InputValid();
    StudentList studentList = new StudentList();

    public void creatStudent() {
        int count = 0;
        System.out.println("--------------creatStudent--------------");
        while (true) {
            System.out.println("Enter id: ");
            String id = input.checkInputString();
            System.out.println("Enter student name: ");
            String studentName = input.checkInputString();
            for (Student student : studentList.getStudentList()) {
                if (student.getId().equals(id) && student.getStudentName().equals(studentName)) {
                    System.err.println("Id has exist student.");
                    System.out.println("Please input again: ");
                    continue;
                }
            }
            System.out.println("Enter semester: ");
            String semester = input.checkInputString();
            System.out.println("Course name:");
            String courseName = input.checkInputCourse();
            Student student = new Student(id, studentName, semester, courseName);
            if (!input.checkStudentExist(student, studentList.getStudentList())) {
                System.out.println("Student has exist: ");
                System.out.println("Enter again: ");
                continue;
            }
            studentList.createStudent(student);
            count = studentList.getStudentList().size();
            if (count > 3) {
                if (input.checkInputYN()) {
                    return;
                }
            }
        }
    }

    public void findAndSort() {
        if (studentList.getStudentList().isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Enter name: ");
        String name = input.checkInputString();
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent = studentList.searchAndSortStudent(name);
        if (listStudent.isEmpty()) {
            System.out.println("Not exist");
        } else {
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            for (Student student : listStudent) {
                student.display();
            }
        }
    }

    public void updateOrDelStudent() {
        if (studentList.getStudentList().isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Enter id: ");
        String id = input.checkInputString();
        ArrayList<Student> students = new ArrayList<>();
        students = studentList.searchStudentId(id);
        if (students.isEmpty()) {
            System.out.println("Not found");
            return;
        } else {
            Student student = getListStudentFound(students);
            System.out.println("Do you want to Update (U) or Delete (D) student:");
            if (input.checkInputUD()) {
                String idStudent = input.checkInputString();
                System.out.println("Enter student name: ");
                String studentName = input.checkInputString();
                System.out.println("Enter semester: ");
                String semester = input.checkInputString();
                System.out.println("Course name:");
                String courseName = input.checkInputCourse();
                if (idStudent.equalsIgnoreCase(student.getId())
                        && studentName.equalsIgnoreCase(student.getStudentName())) {
                    if (semester.equalsIgnoreCase(student.getSemester())
                            && courseName.equalsIgnoreCase(student.getCourseName())) {
                        System.out.println("No Change");
                    } else if (!input.checkStudentExist(student, studentList.getStudentList())) {
                        System.out.println("Duplicate");
                        return;
                    } else {
                        student.setSemester(semester);
                        student.setCourseName(courseName);
                        System.err.println("Update success.");
                    }
                } else {
                    System.out.println("id or name have been changed:");
                    System.out.println("Do you want to change name or id for all: ");
                    if (!input.checkInputYN()) {
                        changeInfor(students, idStudent, courseName);
                        System.err.println("Update success.");
                    }
                }
            } else {
                studentList.delStudent(student);
                System.out.println("Delete success");
                return;
            }

        }

    }

    public void report() {
        HashMap<String, Integer> hmReport = new HashMap<>();
        if (studentList.getStudentList().isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            for (Student student : studentList.getStudentList()) {
                String temp = student.getId() + " | " + student.getStudentName() + " | " + student.getSemester()
                        + " | ";
                hmReport.put(temp, hmReport.getOrDefault(temp, 0) + 1);
            }
            hmReport.forEach((k, v) -> {
                System.out.println(k + v);
            });
        }
    }

    public void changeInfor(ArrayList<Student> students, String id, String name) {
        for (Student student : students) {
            student.setId(id);
            student.setStudentName(name);
        }
    }

    public Student getListStudentFound(ArrayList<Student> students) {
        System.out.println("List student found: ");
        int count = 1;
        System.out.printf("%-10s%15s%15s%15s\n", "Number", "Student name", "Semester", "Course Name");
        for (Student student : students) {
            System.out.printf("%-10s%15s%15s%15s\n", count, student.getStudentName(), student.getSemester(),
                    student.getCourseName());
            count++;
        }
        System.out.println("Enter student by number: ");
        int number = input.checkLimitInput(1, students.size());
        return students.get(number - 1);
    }
}
