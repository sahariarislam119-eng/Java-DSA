package Pattern_Printing;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int mid = n/2+1;
        if(n%2!=0){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n ; j++) {
                    if(i==j || i+j==n+1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Input is even please input an odd number.");
        }
    }
}
