package Arrays_1D;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target =sc.nextInt();
        int a, b;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a = i;
                    b = j;
                    System.out.println("The two sum element indexes are " + a + " and " + b);
                    return;
                }
            }
        }
        System.out.println("No pair found.");
    }
}