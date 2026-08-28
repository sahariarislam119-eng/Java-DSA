package Loops;

import java.util.Scanner;

public class AToThePowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int aToThePowerb=1;
        for(int i=1;i<=power;i++){
            aToThePowerb=aToThePowerb*base;
        }
        System.out.println(base+" to the power "+power+" = "+aToThePowerb);
    }
}
