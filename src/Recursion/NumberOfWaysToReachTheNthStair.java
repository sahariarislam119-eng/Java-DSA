package Recursion;

import java.util.Scanner;

public class NumberOfWaysToReachTheNthStair {
    public static int stairs(int n){
        if (n==1 || n==2) return n;
        return stairs(n-1)+stairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Number of ways to reach "+n+"th stair = "+stairs(n));
    }
}
