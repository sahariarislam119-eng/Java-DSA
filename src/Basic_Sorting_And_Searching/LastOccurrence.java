package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class LastOccurrence {
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
        int n=arr.length-1;
        for(int i=n-1;i>-1;i--){
            if(arr[i]==key){
                System.out.print("Element last occurrence at index "+i);
                return;
            }
        }
        System.out.println("Element not found.");
    }
}
