package Metods;

import java.util.Scanner;

public class PermutationAndCombination {

    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int combination(int n, int r){
        int c = fact(n)/(fact(r)*fact(n-r));
        return c;
    }

    public static int permutation(int n, int r){
        int p = fact(n)/fact(n-r);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println("1.nPr \n2.nCr ");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if(choice==1) System.out.println("nPr = "+permutation(n,r));
        else if (choice==2) System.out.println("nCr = "+combination(n,r));
        else System.out.println("Entered wrong input.");
    }
}
