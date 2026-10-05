package Recursion;

import java.util.Scanner;

public class PrintOneToNUsingGlobalVariable {
    static int n;
    public static void OneToN(int x){
        if(x>n) return;
        System.out.print(x+" ");
        OneToN(x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("1 to "+n+" : ");
        OneToN(1);
    }
}