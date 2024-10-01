package TranHoangViet_DE180482_SE18D10_week4.analyzeinputstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AnalyzeString {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean checkSquareNumber(int number) {
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt) == number;
    }

    public static void getNumber(String input) {
        HashMap<String, ArrayList<Integer>> numberMap = new HashMap<>();
        String number = input.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] numList = number.split(",");
        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listSquare = new ArrayList<>();
        ArrayList<Integer> listAll = new ArrayList<>();
        for (String s : numList) {
            if (!s.isEmpty()) {
                int numberCheck = Integer.parseInt(s);
                if (numberCheck % 2 == 0) {
                    listEven.add(numberCheck);
                } else {
                    listOdd.add(numberCheck);
                }
                if (checkSquareNumber(numberCheck)) {
                    listSquare.add(numberCheck);
                }
                listAll.add(numberCheck);
            }
        }
        numberMap.put("Perfect Square Numbers: ", listSquare);
        numberMap.put("Odd Numbers: ", listOdd);
        numberMap.put("Even Numbers: ", listEven);
        numberMap.put("All Numbers: ", listAll);
        numberMap.forEach((k, v) -> {
            System.out.println(k + v);
        });
    }

    public static void getCharacter(String inputString) {
        HashMap<String, String> stringMap = new HashMap<>();
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("[0-9]", "");
        stringMap.put("Uppercase: ", uppercase);
        stringMap.put("Lowercase: ", lowercase);
        stringMap.put("Special: ", special);
        stringMap.put("All Character: ", allCharacter);
        stringMap.forEach((k, v) -> {
            System.out.println(k + v);
        });
    }

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String result;
        while (true) {
            result = scanner.nextLine();
            if (result.isEmpty() || result.startsWith(" ")) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                break;
            }
        }
        getNumber(result);
        getCharacter(result);
    }
}
