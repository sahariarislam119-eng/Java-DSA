package Loops;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse = 0, ld = 0;
        while (n != 0) {
            ld = n % 10;
            reverse = reverse * 10 + ld;
            n /= 10;
        }
        System.out.println("The reversed number = " + reverse);
    }
}

