package If_Else;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of manufacturing: ");
        double cost = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();
        if (sp - cost > 0) {
            System.out.println("Total profit made = " + (sp - cost));
        }
        else if (sp - cost < 0) {
            System.out.println("Total loss made = " + (cost - sp));
        }
        else {
            System.out.println("No profit no loss.");
        }
    }
}
