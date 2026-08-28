package Arrays_1D;

import java.util.Scanner;

public class RotateArrayAntiClockwise {

    public static void reverse(int i, int j, int[] arr){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k= arr.length-k;
        k= k%arr.length;

        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);

        System.out.print("Rotated array:");
        for(int ele : arr) System.out.print(ele+" ");
    }
}
