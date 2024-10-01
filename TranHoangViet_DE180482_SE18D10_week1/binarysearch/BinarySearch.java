package TranHoangViet_DE180482_SE18D10_week1.binarysearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static final Scanner scanner = new Scanner(System.in);
    public static int[] arr;

    public int checkInput() {
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

    public void sortBubble(int a[], int n) {
        boolean isSwap;
        int temp;
        for (int i = 0; i < n; i++) {
            isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    public int searchBinary(int left, int right, int value) {
        while (left <= right) {
            int middle = (right + left) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] > value) {
                return searchBinary(left, middle - 1, value);
            } else {
                return searchBinary(middle + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch brs = new BinarySearch();
        System.out.println("Enter number of array: ");
        int length = brs.checkInput();
        System.out.println("Enter search value: ");
        int search = scanner.nextInt();
        arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(length);

        }
        brs.sortBubble(arr, length);
        System.out.println("Sorted arrays: " + Arrays.toString(arr) + "\n");
        int foundIndex = brs.searchBinary(0, length - 1, search);
        if (foundIndex < 0) {
            System.out.println("Not found index in array!!");
        } else {
            System.out.println("Found " + search + " at index: " + foundIndex);
        }
    }
}
