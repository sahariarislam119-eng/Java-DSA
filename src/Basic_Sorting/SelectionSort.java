package Basic_Sorting;

import java.util.Scanner;

public class SelectionSort {
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

    }
}
