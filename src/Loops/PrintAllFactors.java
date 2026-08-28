package Loops;

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("The factors are: ");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i+" "+n/i+" ");
            }
        }
    }
}
