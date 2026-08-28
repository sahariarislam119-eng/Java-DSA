package Pattern_Printing;

import java.util.Scanner;

public class SpaceFlippedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for( int k=1;k<i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
