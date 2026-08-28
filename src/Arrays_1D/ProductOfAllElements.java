package Arrays_1D;

import java.util.Scanner;

public class ProductOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int product = 1;
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }
        System.out.print("Product of all elements: "+ product);
    }
}
