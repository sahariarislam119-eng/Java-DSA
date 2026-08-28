package Arrays_1D;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoArrays {

    public static ArrayList<Integer> addTwoArray(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements for 1st array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter number of elements for 2nd array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array elements: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> answer = addTwoArray(arr1,arr2);
    }
}
