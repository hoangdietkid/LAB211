package TranHoangViet_DE180482_SE18D10_week5.View;

import TranHoangViet_DE180482_SE18D10_week5.Model.Student;
import TranHoangViet_DE180482_SE18D10_week5.Model.StudentList;

public class ManageStudent {
    InputValid input = new InputValid();
    StudentList studentList = new StudentList();

    public void creatStudent() {
        System.out.println("--------------creatStudent--------------");
        while (true) {
            System.out.println("Enter id: ");
            String id = input.checkInputString();
            System.out.println("Enter student name: ");
            String studentName = input.checkInputString();
            for (Student student : studentList.getStudentList()) {
                if (student.getId().equals(id) && student.getStudentName().equals(studentName)) {
                    break;
                } else {

                }

            }
        }
    }
}
