package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class PeakInAMountainArray {
    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter mountain array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        int high=arr.length-2,low=1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println("The Peak index: "+mid);
                System.out.println("The Peak element: "+arr[mid]);
                return;
            }
//            Increasing part
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low=mid+1;
//            Decreasing Part
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) high=mid-1;
        }
    }
}
