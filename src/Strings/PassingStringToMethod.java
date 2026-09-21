package Strings;

import java.util.Scanner;

public class PassingStringToMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x= s.indexOf('i');
        System.out.println(x);
        s = s.toLowerCase();
        System.out.println("Raghav");
    }
}
