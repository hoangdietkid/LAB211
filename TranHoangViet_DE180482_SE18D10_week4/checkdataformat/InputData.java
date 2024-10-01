package TranHoangViet_DE180482_SE18D10_week4.checkdataformat;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InputData {
    public static final Scanner scanner = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public String checkPhone() {
        while (true) {
            try {
                String phonestr = checkInputString();
                float phone = Float.parseFloat(phonestr);
                if (!phonestr.matches("^[0-9]{10}$")) {
                    System.out.println("Phone number must be 10 digits");
                    System.out.println("Enter again:");
                } else {
                    return phonestr;
                }
            } catch (NumberFormatException e) {
                System.err.println("Phone number must be number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = simpleDateFormat.parse(dateCheck);
                return dateCheck;
            } catch (ParseException e) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String mail = checkInputString();
            if (!mail.matches("^[a-zA-Z0-9.!#$%&'*+=?^_`\\\\{|\\\\}~-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,}$\"")) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return mail;
            }
        }
    }
}
