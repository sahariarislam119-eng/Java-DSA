package Loops;

import java.util.Scanner;

public class SumOfDigitsAndReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse = 0, ld = 0,sum=0;
        while (n != 0) {
            ld = n % 10;
            reverse = reverse * 10 + ld;
            sum+=ld;
            n /= 10;
        }
        System.out.println("The reversed number = " + reverse);
        if(sum<0) sum=-sum;
        System.out.println("Sum of all digits = " + sum);
    }
}
