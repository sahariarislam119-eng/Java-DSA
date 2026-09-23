package Strings;

import java.util.Scanner;

public class CompareTwoStrings {

    public static void compare(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("Strings are not equal");
            return;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("Strings are not equal");
                return;
            }
        }
        System.out.println("Strings are equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        compare(s1,s2);
    }
}
