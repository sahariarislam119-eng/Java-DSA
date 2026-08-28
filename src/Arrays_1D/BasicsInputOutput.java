package Arrays_1D;

import java.util.Scanner;

public class BasicsInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        Initialization of Array
        int[] arr = new int[n];
//        Taking Input
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        Printing Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
