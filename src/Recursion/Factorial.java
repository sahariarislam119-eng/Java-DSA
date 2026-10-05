package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int rec(int n) {
        if (n == 0) return 1;
        else return n * rec(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int ans = rec(x);
        System.out.print("Factorial of " + x + " = " + ans);
    }
}