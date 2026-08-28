package Arrays_1D;

import java.util.Scanner;

public class OptimizedMissingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int ele : arr) {
            arrSum += ele;
        }
        System.out.println("The missing element = "+(sum-arrSum));
    }
}
