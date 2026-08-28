package Pattern_Printing;

import java.util.Scanner;

public class StarPyramidSecondMethode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            nsp--;
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nst += 2;
            System.out.println();
        }
    }
}
