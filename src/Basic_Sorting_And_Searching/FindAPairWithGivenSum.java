package Basic_Sorting_And_Searching;

import java.util.Scanner;

import java.util.Arrays;

public class FindAPairWithGivenSum {
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

    public static void printArr(int[]arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = arrayInput();
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                System.out.println("The pair: ("+arr[i]+","+arr[j]+")");
                return;
            }
        }
        System.out.println("There are no pair exist.");
    }
}
