package If_Else;

import java.util.Scanner;

public class DivisibleBy5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        if (x % 5 == 0 || x % 3 == 0) {
            System.out.println(x + " is divisible by 5 or 3");
        } else {
            System.out.println(x + " is neither divisible by 5 nor 3");
        }
    }
}
