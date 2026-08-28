package Pattern_Printing;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int m = sc.nextInt();
        int n = m-1;
        int nsp=1;
        int nst=n;
        for(int i=1;i<=2*m-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }
            nst--;
            nsp+=2;
            System.out.println();
        }
    }
}
