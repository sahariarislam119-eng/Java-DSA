package Pattern_Printing;

import java.util.Scanner;

public class AlphabetSquareSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextByte();
        for (int i = 65; i <= 64+r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}
