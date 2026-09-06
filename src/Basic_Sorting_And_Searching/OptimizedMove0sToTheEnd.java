package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class OptimizedMove0sToTheEnd {
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
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==0&&arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
            if(arr[i]!=0) i++;
            j++;
        }
        System.out.print("Sorted array: ");
        printArr(arr);
    }
}
