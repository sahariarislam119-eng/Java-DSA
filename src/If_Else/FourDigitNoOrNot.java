package If_Else;

import java.util.Scanner;

public class FourDigitNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        if (x > 999 && x < 10000) {
            System.out.println(x + " is a four digit number");
        }
        else {
            System.out.println(x + " is not a four digit number");
        }
    }
}
