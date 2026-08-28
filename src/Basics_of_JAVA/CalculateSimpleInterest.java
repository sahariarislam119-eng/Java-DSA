package Basics_of_JAVA;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter principle: ");
        double p = sr.nextDouble();
        System.out.print("Enter time: ");
        double t = sr.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sr.nextDouble();
        double si = (p * t * r) / 100.0;
        System.out.println("The simple interest = " + si);
    }
}
