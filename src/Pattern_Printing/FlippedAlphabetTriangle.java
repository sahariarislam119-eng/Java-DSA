package Pattern_Printing;

import java.util.Scanner;

public class FlippedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 65;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
