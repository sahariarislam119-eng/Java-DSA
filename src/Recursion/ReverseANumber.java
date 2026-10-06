package Recursion;

import java.util.Scanner;

public class ReverseANumber {
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number: "+reverse(num,0));
    }
}
