package Pattern_Printing;

import java.util.Scanner;

public class NumberSquareMast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextByte();
        int a = 65;
        int b = 97;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i%2!=0) System.out.print((char)b+" ");
                else System.out.print((char)a+" ");
            }
            a++;
            b++;
            System.out.println();
        }
    }
}
