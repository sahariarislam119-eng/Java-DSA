package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class CheckSortedOrNot {

    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void checking(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not Sorted.");
                return;
            }
        }
        System.out.println("Array is sorted.");
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        checking(arr);
    }
}
