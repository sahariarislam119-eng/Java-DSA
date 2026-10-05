package Recursion;

import java.util.Scanner;

public class PrintOneToN3rdMethode {
    public static void OnetoN(int n){
        if(n==0) return;
        OnetoN(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("1 to "+x+" : ");
        OnetoN(x);
    }
}
