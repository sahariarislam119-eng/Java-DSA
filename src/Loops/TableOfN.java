package Loops;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (i = n; i <= 10 * n; i += n) {
            System.out.print(i + " ");
        }
    }
}
