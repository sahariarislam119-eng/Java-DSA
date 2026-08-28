package Basics_of_JAVA;

import java.util.Scanner;

public class SumOfThreeNumbersUsingUserInput {
    public static void main(String[] args) {
        Scanner sr1 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sr1.nextInt();
        System.out.print("Enter second number: ");
        int y = sr1.nextInt();
        System.out.print("Enter third number: ");
        int z = sr1.nextInt();
        System.out.println("The sum of above three numbers = " + (x + y + z));
    }
}
