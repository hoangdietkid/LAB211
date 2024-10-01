package TranHoangViet_DE180482_SE18D10_week2.contactmanagementprogram.View;

import java.util.Scanner;

public class InputValid {
    public static final Scanner scanner = new Scanner(System.in);
    final String regex = "^\\d{10}$|^\\d{3}[-]\\d{3}[-]\\d{4}$|^\\\\d{3}[.]\\\\d{3}[.]\\\\d{4}$|^\\d{3}[-]\\d{3}[-]\\d{4}\\sx\\d{4}$|^\\d{3}[-]\\d{3}[-]\\d{4}\\sext\\d{4}$|^\\d{3}\\s\\d{3}\\s\\d{4}$";

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
            String input = checkInputString().toLowerCase().trim();
            if (!input.equals("y") && !input.equals("n")) {
                System.out.println("Must be Y or N");
                System.out.println("Enter again: ");
            } else {
                return input.equals("n");
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(regex)) {
                return result;
            }
            System.err.println("A phone number only has the following format: \n" +
                    "• 1234567890\n" +
                    "• 123-456-7890\n" +
                    "• 123-456-7890 x1234\n" +
                    "• 123-456-7890 ext1234\n" +
                    "• 123.456.7890\n" +
                    "• 123 456 7890\n");
            System.out.println("Enter again: ");
        }
    }
}
