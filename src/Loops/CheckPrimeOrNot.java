package Loops;

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if(n<=1)
            System.out.println(n+" is neither nor composite.");
        else if(flag)
            System.out.println(n+" is prime.");
        else
            System.out.println(n+" is composite.");
    }
}
