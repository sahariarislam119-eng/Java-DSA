package Pattern_Printing;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
