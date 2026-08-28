package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        // Condition ? Print when true : Print when false
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}
