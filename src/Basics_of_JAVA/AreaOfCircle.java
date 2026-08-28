package Basics_of_JAVA;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radious: ");
        int radious = sc.nextInt();
        //pi*r*r
        float pi = 22f / 7f;
        double area = pi * radious * radious;
        System.out.println("Area of circle = " + area);

    }
}
