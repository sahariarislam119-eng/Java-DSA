package If_Else;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x % 2 == 0)
        {
            System.out.println("This is an even number.");
        }
        else System.out.println("This is an odd number");

    }
}
