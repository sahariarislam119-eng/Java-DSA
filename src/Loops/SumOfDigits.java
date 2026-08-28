package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0, ld = 0;
        if (n < 0) n=-n;
        while (n != 0) {
            ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println("Sum of all digits = " + sum);
    }
}

