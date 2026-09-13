package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class MaximumCountOfPositiveAndNegativeInteger {

    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements in increasing order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

//    public static int maximumCount(int[] arr){
//        // Counting negative elements:
//        int low=0,high=arr.length-1,idx1=-1;
//        while(low<=high){
//            int mid = (high+low)/2;
//            if(arr[mid]>=0) high = mid-1;
//            else if(arr[mid]<0){
//                idx1=mid;
//                low=mid+1;
//            }
//        }
//        int negativeIntegers=idx1+1;
//        low=0;
//        high=arr.length-1;
//        int idx2=-1;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]<=0) low = mid+1;
//            else if(arr[mid]>0){
//                idx2=mid;
//                high=mid-1;
//            }
//        }
//        int positiveIntegers;
//        if(idx2!=-1){
//            positiveIntegers = arr.length - idx2;
//        }
//        else positiveIntegers=0;
//        return Math.max(positiveIntegers,negativeIntegers);
//    }
//

    public static int maximumCount(int[] arr) {

        // Find first element >= 0
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        int negativeIntegers = low;

        // Find first element > 0
        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        int positiveIntegers = arr.length - low;

        return Math.max(negativeIntegers, positiveIntegers);
    }

    public static void main(String[] args) {
        int[]arr=arrayInput();
        int n= maximumCount(arr);
        System.out.println(n);
    }
}
