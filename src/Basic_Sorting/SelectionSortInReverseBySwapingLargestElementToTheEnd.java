package Basic_Sorting;

import java.util.Scanner;

public class SelectionSortInReverseBySwapingLargestElementToTheEnd {
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

    public static void printArr(int[]arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        for (int i = arr.length - 1; i > 0; i--) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (arr[i] < max) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}
