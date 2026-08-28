package Arrays_1D;

import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int pos = -1;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                pos = i;
                break;
            }
        }
        if (found) System.out.println(x + " found in array at index " + pos + ".");
        else System.out.println(x + " not found in array.");
    }
}