package Arrays_1D;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArraysInASingleArray {

    public static void mergeArray(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (i<a.length) c[k++]=a[i++];
        while (j<b.length) c[k++]=b[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements for 1st array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        System.out.print("\nEnter number of elements for 2nd array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        int[] arr3 = new int[arr1.length + arr2.length];
        mergeArray(arr1, arr2, arr3);
        System.out.print("Single big array: ");
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }
}
