package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class FirstOccurrence {
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
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==key){
                System.out.print("First occurrence of "+key+" at index: "+i);
                return;
            }
            else i++;
        }
        System.out.print("Not found in array.");
    }
}
