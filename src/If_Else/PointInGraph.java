package If_Else;

import java.util.Scanner;

public class PointInGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point (x,y).");
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Point is origin");
        } else if (y == 0) {
            System.out.println("Point is on X-Axis");
        } else if (x == 0) {
            System.out.println("Point is on Y-Axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Point is in first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in third quadrant");
        } else {
            System.out.println("Point is in fourth quadrant");
        }
    }
}
