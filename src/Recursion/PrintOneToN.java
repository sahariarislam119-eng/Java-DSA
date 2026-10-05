package Recursion;

import java.util.Scanner;

public class PrintOneToN {
    public static void OnetoN(int x, int n){
        if(x>n) return;
        System.out.print(x+" ");
        OnetoN(x+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("1 to "+x+" : ");
        OnetoN(1,x);
    }
}
