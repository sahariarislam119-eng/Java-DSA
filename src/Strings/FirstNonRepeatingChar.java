package Strings;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char nonRepeating(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            if(freq[idx]==1) return s.charAt(i);
        }
        return '$';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(nonRepeating(str)=='$') System.out.println("There are no unique element in the string "+str);
        else System.out.println("The first non repeating element is "+nonRepeating(str));
    }
}
