package Basic_Sorting_And_Searching;

import java.util.Scanner;

public class ArrangeCoins {

    public static int arrangeCoins(int n) {
        double root = Math.sqrt(8L *n+1);
        int k= ((int)root-1)/2;
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        int coin = sc.nextInt();
        System.out.println("Number of complete rows: "+arrangeCoins(coin));
    }
}
