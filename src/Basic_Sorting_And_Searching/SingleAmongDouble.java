package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class SingleAmongDouble {
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

    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length-1;
        if(arr.length==1) return arr[0];
        else{
            if(arr[0]!=arr[1]) return arr[0];
            else if(arr[n]!=arr[n-1]) return arr[n];
            else{
                int low=2, high=n-2;
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                        return arr[mid];
                    }
                    else if(arr[mid]==arr[mid-1]){
                        if(mid%2!=0) low=mid+1;
                        else high=mid-1;
                    }
                    else if(arr[mid]==arr[mid+1]){
                        if((n-mid)%2!=0) high = mid-1;
                        else low=mid+1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[]arr=arrayInput();
        System.out.println("The single element: "+singleNonDuplicate(arr));
    }
}
