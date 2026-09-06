package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class BubbleSort {
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
        for(int i=0;i<arr.length-1;i++){
            boolean isSorted = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(isSorted) break;
        }
        System.out.print("Sorted array: ");
        printArr(arr);
    }
}
