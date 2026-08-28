package Arrays_1D;

import java.util.Scanner;

public class SegregateZerosAndOnes {

    public static void segregate(int[] arr) {
        int zero = 0;
        for (int ele : arr) {
            if (ele == 0) zero++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zero) arr[i] = 0;
            else arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        segregate(arr);
        System.out.print("Segregated array: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}