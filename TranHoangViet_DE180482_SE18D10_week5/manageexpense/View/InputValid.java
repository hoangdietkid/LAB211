package TranHoangViet_DE180482_SE18D10_week5.manageexpense.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputValid {
    public static final Scanner scanner = new Scanner(System.in);
    final static String DATE_FORMAT = "dd-MMM-yyyy";

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

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString().trim());
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
                return input.equalsIgnoreCase("n");
            }
        }
    }

    public Date checkValidDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        simpleDateFormat.setLenient(false);
        while (true) {
            try {
                return simpleDateFormat.parse(checkInputString());
            } catch (ParseException e) {
                System.out.println("Information must be valid date in the format dd-MM-yyyy");
                System.out.println("Enter again: ");
            }
        }
    }

}
