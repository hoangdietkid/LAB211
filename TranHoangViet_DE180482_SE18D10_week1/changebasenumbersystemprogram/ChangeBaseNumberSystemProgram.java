package TranHoangViet_DE180482_SE18D10_week1.changebasenumbersystemprogram;

import java.util.Scanner;

public class ChangeBaseNumberSystemProgram {
    public static final ChangeBaseNumberSystemProgram changebase = new ChangeBaseNumberSystemProgram();
    public static final Scanner scanner = new Scanner(System.in);

    public static final String BINARY_VALID = "[0-1]*";
    public static final String DECIMAL_VALID = "[0-9]*";
    public static final String HEXADECIMAL_VALID = "[0-9A-F]*";

    public int checkInputLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputBinary() {
        System.out.println("Enter number binary: ");
        String result;
        while (true) {
            result = scanner.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.out.println("Must be enter 0 or 1!!");
            System.out.println("Enter again: ");
        }
    }

    public String checkInputDecimal() {
        System.out.println("Enter number decimal: ");
        String result;
        while (true) {
            result = scanner.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            }
            System.out.println("Must be enter 0-9!!");
            System.out.println("Enter again: ");
        }
    }

    public String checkInputHexaDecimal() {
        System.out.println("Enter number hexa decimal: ");
        String result;
        while (true) {
            result = scanner.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.out.println("Must be enter 0-9 A-F!!");
            System.out.println("Enter again: ");
        }
    }

    public String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public String convertBinaryToHexaDecimal(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        String hex = convertDecimalToHexa(decimal);
        return hex;
    }

    public String convertHexaToDecimal(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return Integer.toString(decimal);
    }

    public String convertHexaToBinary(String hex) {
        String binary = Integer.toBinaryString(Integer.parseInt(convertHexaToDecimal(hex)));
        return binary;
    }

    public String convertDecimalToBinary(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    public String convertDecimalToHexa(String decimal) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F' };
        String hex = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            hex = hexDigits[deci % 16] + hex;
            deci /= 16;
        }
        return hex;
    }

    public int menu() {
        System.out.println("1. Convert from binary: ");
        System.out.println("2. Convert from decimal: ");
        System.out.println("3. Convert from hexadecimal: ");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice: ");
        int choice = changebase.checkInputLimit(1, 4);
        return choice;
    }

    public int displayConvert(String from, String case1, String case2) {
        System.out.println("1. Convert from " + from + " to " + case1);
        System.out.println("2. Convert from " + from + " to " + case2);
        System.out.println("Enter your choice: ");
        int choice = changebase.checkInputLimit(1, 2);
        return choice;
    }

    public void convertFromBinary(String binary) {
        int choice = changebase.displayConvert("Binary", "Decimal", "HexaDecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + changebase.convertBinaryToDecimal(binary));
                break;

            case 2:
                System.out.println("HexaDeciaml: " + changebase.convertBinaryToHexaDecimal(binary));
                break;
        }
    }

    public void convertFromDecimal(String decimal) {
        int choice = changebase.displayConvert("Decimal", "Binary", "HexaDecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + changebase.convertDecimalToBinary(decimal));
                break;

            case 2:
                System.out.println("HexaDecimal: " + changebase.convertDecimalToHexa(decimal));
                break;
        }
    }

    public void convertFromHexa(String hex) {
        int choice = changebase.displayConvert("HexaDecimal", "Binary", "Decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + changebase.convertHexaToBinary(hex));
                break;

            case 2:
                System.out.println("Decimal: " + changebase.convertHexaToDecimal(hex));
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            int choice = changebase.menu();
            switch (choice) {
                case 1:
                    String binary = changebase.checkInputBinary();
                    changebase.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = changebase.checkInputDecimal();
                    changebase.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hex = changebase.checkInputHexaDecimal();
                    changebase.convertFromHexa(hex);
                    break;
                case 4:
                    System.out.println("Thanks for using!!!");
                    return;
            }
        }
    }
}
