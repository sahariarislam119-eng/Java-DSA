package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class KthSmallestElement {
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

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        System.out.print("Enter k: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE, minIndex = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("K'th smallest element = "+arr[k-1]);
    }
}