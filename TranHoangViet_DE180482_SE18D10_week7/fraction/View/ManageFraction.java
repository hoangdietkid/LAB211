package TranHoangViet_DE180482_SE18D10_week7.fraction.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import TranHoangViet_DE180482_SE18D10_week7.fraction.Model.Fraction;
import TranHoangViet_DE180482_SE18D10_week7.fraction.Model.FractionList;

public class ManageFraction {
    public static Scanner scanner = new Scanner(System.in);
    FractionList fractionList = new FractionList();

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

    public void createFraction() {
        Random random = new Random();
        System.out.println("Enter number: ");
        int n = checkInputInt();
        int numerator;
        int denominator;
        for (int i = 0; i < n; i++) {
            numerator = random.nextInt(n) + 1;
            denominator = random.nextInt(n) + 1;
            fractionList.addFraction(new Fraction(numerator, denominator));
        }
        display();
    }

    public void display() {
        ArrayList<Fraction> temp = fractionList.getFractionList();
        Collections.sort(temp);
        System.out.print("[");
        for (int i = 0; i < temp.size(); i++) {
            if (i == 0) {
                System.out.print(temp.get(i).toString());
            } else {

                System.out.print(", " + temp.get(i).toString());
            }
        }
        System.out.println("]");
    }

    public void sumFraction() {
        Fraction sum = new Fraction(0, 1);
        for (Fraction fraction : fractionList.getFractionList()) {
            sum = sum.add(fraction);
        }
        System.out.println("Sum: " + sum.toString());
    }
}
