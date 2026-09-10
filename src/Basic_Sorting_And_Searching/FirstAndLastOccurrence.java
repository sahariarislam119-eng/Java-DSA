package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class FirstAndLastOccurrence {
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
//        Finding First occurrence.
        int low = 0, high = arr.length - 1, idxF = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                idxF = mid;
                high = mid - 1;
            } else if (arr[mid] > key) high = mid - 1;
            else if (arr[mid] < key) low = mid + 1;
        }
//        Finding Last Occurrence.
        int idxL = -1;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                idxL = mid;
                low = mid + 1;
            } else if (arr[mid] > key) high = mid - 1;
            else if (arr[mid] < key) low = mid + 1;
        }
        if(idxF==-1&&idxL==-1) System.out.println("Element not found.");
        else System.out.println("Element found first and last occurrence: ("+idxF+","+idxL+")");
    }
}
