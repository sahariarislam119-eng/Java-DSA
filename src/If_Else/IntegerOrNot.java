package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = sc.nextDouble();
        int n = (int) x;
        if (x - n == 0) {
            System.out.println("Is an Integer");
        }
        else {
            System.out.println("Not an Integer");
        }
    }
}
