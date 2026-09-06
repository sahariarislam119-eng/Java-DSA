package Basic_Sorting;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class CommonElement {
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
        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = arrayInput();
        Arrays.sort(a);
        System.out.print("Sorted Array: ");
        printArr(a);
        System.out.println();
        int[] b = arrayInput();
        Arrays.sort(b);
        System.out.print("Sorted Array: ");
        printArr(b);
        System.out.println();
        int x= a.length, y= b.length;
        int i=0,j=0;
        while(i<x&&j<y){
            if(a[i]==b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]) {
                j++;
            }
            else if(a[i]<b[j]) {
                i++;
            }
        }
        System.out.print("Common elements are: ");
        System.out.println(arr);
    }
}
