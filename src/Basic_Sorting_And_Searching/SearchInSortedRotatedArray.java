package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class SearchInSortedRotatedArray {
    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter(Rotated) array elements in increasing order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int search(int[] arr, int key) {
        int n = arr.length-1;
        int low = 0, high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=key && key<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[mid]<key && key<=arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= arrayInput();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();;
        int x= search(arr,key);
        if(x==-1) System.out.println("Element not found");
        else System.out.println("Element found at index "+x);
    }
}
