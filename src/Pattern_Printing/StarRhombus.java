package Pattern_Printing;

import java.util.Scanner;

public class StarRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextByte();
        for (int i = 1; i <= r; i++) {
            for (int k = 1; k <= r - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
