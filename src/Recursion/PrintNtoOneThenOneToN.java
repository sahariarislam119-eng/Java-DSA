package Recursion;

import java.util.Scanner;

public class PrintNtoOneThenOneToN {
    public static void Print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        Print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        Print(x);
    }
}
