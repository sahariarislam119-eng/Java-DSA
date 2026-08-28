package Pattern_Printing;

import java.util.Scanner;

public class AlphabetAndNumberTriangleMast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 65;
            for (int j = 1; j <= i; j++) {
                if(i%2==0) System.out.print((char)a+" ");
                else System.out.print(j+" ");
                a++;
            }
            System.out.println();
        }
    }
}
