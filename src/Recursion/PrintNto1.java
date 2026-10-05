package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void NtoOne(int n){
        if(n==0) return;
        System.out.print(n+" ");
        NtoOne(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print(x+" to 1: ");
        NtoOne(x);
    }
}
