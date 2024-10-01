package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.View;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.Worker;
import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.WorkerList;

public class InputValid {
    public static final Scanner scanner = new Scanner(System.in);
    final static String DATE_FORMAT = "dd/MM/yyyy";
    public static WorkerList workerList = new WorkerList();

    public String checkInputString() {
        while (true) {
            String result = scanner.nextLine();
            if (result.isEmpty() || result.startsWith(" ")) {
                System.err.println("Is empty");
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

    public double checkInputdouble() {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString().trim());
                if (result < 0) {
                    System.err.println("Must be positive double");
                    System.out.println("Enter again:");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid double:");
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
            String input = checkInputString().toLowerCase().trim();
            if (!input.equals("y") && !input.equals("n")) {
                System.out.println("Must be Y or N");
                System.out.println("Enter again: ");
            } else {
                return input.equals("n");
            }
        }
    }

    public Date checkValidDate(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                return validStringToDate(checkInputString());
            } catch (ParseException ex) {
                System.out.println("Invalid date. Please use the format: dd/MM/yyyy");
            }
        }
    }

    public Date validStringToDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        df.setLenient(false);
        return df.parse(date);
    }

    public boolean checkDuplicate(String id,
            String name, int age, String workLocation, double salary) {
        for (Worker worker : workerList.getWorkers()) {
            if (worker.getId().equals(id) && worker.getName().equals(name) && worker.getAge() == age
                    && worker.getWorkLocation().equals(workLocation) && worker.getSalary() == salary) {
                return false;
            }
        }
        return true;
    }
}
