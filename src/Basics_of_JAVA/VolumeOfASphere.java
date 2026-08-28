package Basics_of_JAVA;

import java.util.Scanner;

public class VolumeOfASphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radious: ");
        int radious = sc.nextInt();
        float pi = 22f / 7f;
        double volume = 4.0 / 3 * pi * radious * radious * radious;
        System.out.println("The volume of the shpear with radious " + radious + " = " + volume);
    }
}
