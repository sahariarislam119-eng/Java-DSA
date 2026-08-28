package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println("Hello World");
            i++;
        }
    }
}
