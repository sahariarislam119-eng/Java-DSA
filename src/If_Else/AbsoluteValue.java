package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.println("The absolute value is " + x);
        }
        else {
            System.out.println("The absolute value is "+(-x));
        }
    }
}
