package TranHoangViet_DE180482_SE18D10_week1.bubblesortalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    private static final Scanner scanner = new Scanner(System.in);

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
        BubbleSortAlgorithm bs = new BubbleSortAlgorithm();
        System.out.println("Enter number element of array: ");
        int n = bs.CheckInput();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.print("Unsorted array: " + Arrays.toString(arr) + "\n");
        bs.sortBubble(arr, n);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
    
}
