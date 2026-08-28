package Loops;

import java.util.Scanner;

public class GP1_2_4_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=1, r=2;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
