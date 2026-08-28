package Arrays_1D;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0;
        for(int i=arr.length-1;i>=arr.length/2;i--){
            int temp = arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
            a++;
        }
//        Another Approach;
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}