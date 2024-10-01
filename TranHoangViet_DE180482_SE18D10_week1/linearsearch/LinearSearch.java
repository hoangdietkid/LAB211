package TranHoangViet_DE180482_SE18D10_week1.linearsearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static final Scanner scanner = new Scanner(System.in);

    public int searchLinearPos(int[] arr, int value) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int CheckInput() {
        while (true) {
            try {
                int numb = Integer.parseInt(scanner.nextLine().trim());
                if (numb > 0) {
                    return numb;
                } else {
                    System.out.println("Pls enter positive number: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input integer positive number : ");
                System.out.println("Enter again: ");
            }
        }

    }

    public static void main(String[] args) {
        LinearSearch linear = new LinearSearch();
        System.out.println("Enter number of array: ");
        int n = linear.CheckInput();
        System.out.println("Enter search value: ");
        int value = linear.CheckInput();
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        System.out.print("The array: " + Arrays.toString(arr) + "\n");
        int foundIndex = linear.searchLinearPos(arr, value);
        if (foundIndex < 0) {
            System.out.println("Not found!!");
        } else {
            System.out.println("Found " + value + " at index: " + foundIndex);
        }

    }
}
