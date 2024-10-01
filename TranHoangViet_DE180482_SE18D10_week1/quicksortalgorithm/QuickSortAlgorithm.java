package TranHoangViet_DE180482_SE18D10_week1.quicksortalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortAlgorithm {
    public static final Scanner scanner = new Scanner(System.in);

    public void sortQuickAlgorithm(int[] arr, int left, int right) {
        if (left > right || arr.length == 0) {
            return;
        }
        int middle = left + (right - left) / 2;
        int pivot = arr[middle];
        int i = left, j = right;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            sortQuickAlgorithm(arr, left, j);
        }
        if (right > i) {
            sortQuickAlgorithm(arr, i, right);
        }
    }

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

    public static void main(String[] args) {
        QuickSortAlgorithm quick = new QuickSortAlgorithm();
        System.out.println("Enter number of array: ");
        int n = quick.checkInput();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(99) + 1;
        }
        System.out.print("Unsorted array: " + Arrays.toString(arr) + "\n");
        quick.sortQuickAlgorithm(arr, 0, n - 1);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}
