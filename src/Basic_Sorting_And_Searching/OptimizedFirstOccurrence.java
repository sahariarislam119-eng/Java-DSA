package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class OptimizedFirstOccurrence {
    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements(In sorted order): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int low = 0, high = arr.length - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                idx = mid;
                high = mid - 1;
            } else if (arr[mid] > key) high = mid - 1;
            else if (arr[mid] < key) low = mid + 1;
        }
        if (idx == -1) System.out.println("Element not found.");
        else System.out.println("Element's first occurrence : " + idx);
    }
}
