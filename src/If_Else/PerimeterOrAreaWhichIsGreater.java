package If_Else;

import java.util.Scanner;

public class PerimeterOrAreaWhichIsGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth: ");
        int bre = sc.nextInt();
        int area = len * bre;
        System.out.println("Area = " + area);
        int peri = (2 * len) + (2 * bre);
        System.out.println("Perimeter = " + peri);
        if (area > peri) {
            System.out.println("Area is greater than perimeter.");
        }
        else if(area == peri){
            System.out.println("Area and perimeter are equal.");
        }
        else {
            System.out.println("Perimeter is greater than area.");
        }
    }
}
