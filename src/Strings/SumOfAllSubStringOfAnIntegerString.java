package Strings;

import java.util.Scanner;

public class SumOfAllSubStringOfAnIntegerString {

    public static int sumSubstrings(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str = s.substring(i,j);
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        System.out.println("Sum of all substrings of "+s+" = "+sumSubstrings(s));
    }
}
