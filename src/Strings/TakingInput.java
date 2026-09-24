package Strings;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a string: ");
        String str1 = sc.next();
        System.out.println(str);
        System.out.println(str1);
    }
}
