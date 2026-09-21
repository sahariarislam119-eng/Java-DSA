package Strings;

import java.util.Scanner;

public class CountNoOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String s = "";
        s+=n;

        String st = Integer.toString(n);

        System.out.println("Number of digits: "+s.length());
        System.out.println("Number of digits: "+st.length());
    }
}
