package Loops;

import java.util.Scanner;

public class SpecialQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){
            System.out.print(i+" "+a+" ");
            a--;
        }
    }
}
