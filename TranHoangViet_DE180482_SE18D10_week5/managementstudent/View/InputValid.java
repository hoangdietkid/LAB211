package TranHoangViet_DE180482_SE18D10_week5.managementstudent.View;

import java.util.ArrayList;
import java.util.Scanner;

import TranHoangViet_DE180482_SE18D10_week5.managementstudent.Model.Student;

public class InputValid {
    public static final Scanner scanner = new Scanner(System.in);

    public String checkInputString() {
        while (true) {
            String result = scanner.nextLine();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString().trim());
                if (result < 0) {
                    System.err.println("Must be positive integer");
                    System.out.println("Enter again:");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer:");
            }

        }
    }

    public float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(checkInputString().trim());
                if (result < 0) {
                    System.err.println("Must be positive float");
                    System.out.println("Enter again:");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid float:");
            }
        }
    }

    public int checkLimitInput(int min, int max) {
        while (true) {
            try {
                int result = checkInputInt();
                if (result < min || result > max) {
                    throw new NumberFormatException();
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be in rage [ " + min + " to " + max + " ]");
                System.out.println("Enter again");
            }
        }
    }

    public boolean checkInputYN() {
        while (true) {
            System.out.println("Do you want to continue? (Y/N):");
            String input = checkInputString();
            if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
                System.out.println("Must be Y or N");
                System.out.println("Enter again: ");
            } else {
                return input.equals("n");
            }
        }
    }

    public boolean checkInputUD() {
        while (true) {
            String input = checkInputString();
            if (!input.equals("U") && !input.equals("D")) {
                System.out.println("Must be U or D");
                System.out.println("Enter again: ");
            } else {
                return input.equals("U");
            }
        }
    }

    public String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("java") || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }

    public boolean checkStudentExist(Student student, ArrayList<Student> studentList) {
        for (Student temp : studentList) {
            if (temp.getId().equalsIgnoreCase(student.getId())
                    && temp.getStudentName().equalsIgnoreCase(student.getStudentName())
                    && temp.getSemester().equalsIgnoreCase(student.getSemester())
                    && temp.getCourseName().equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }
}
