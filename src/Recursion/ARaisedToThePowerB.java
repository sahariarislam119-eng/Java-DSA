package Recursion;

import java.util.Scanner;

public class ARaisedToThePowerB {
    public static long AtoThePowerB(int a, int b) {
        if (b == 0) return 1;
        return a * AtoThePowerB(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating a^b");
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a + "^" + b + ": " + AtoThePowerB(a, b));
    }
}