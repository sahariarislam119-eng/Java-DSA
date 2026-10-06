package Recursion;

import java.util.Scanner;

public class AtoThePowerOfAReverse {
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        int half = pow(a, b / 2);
        if (b % 2 == 0) return half * half;
        return a * half * half;
    }
    public static int reverse(int n, int r) {
        if (n == 0) return r;
        return reverse(n / 10, r * 10 + n % 10);
    }

    public static int reverseExponentiation(int n) {
        int rev = reverse(n, 0);
        return pow(n,rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = reverseExponentiation(n);
        System.out.println("Ans: "+ans);
    }
}
