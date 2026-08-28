package Loops;

import java.util.Scanner;

public class APtillNterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        for (int i = 2; i <= (3 * n - 1); i += 3) {
//            System.out.print(i + " ");
//        }
        int a=2, cd=3;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=cd;
        }
    }
}
