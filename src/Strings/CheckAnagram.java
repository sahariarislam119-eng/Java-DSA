package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        char[] brr = s2.toCharArray();
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=brr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if(areAnagrams(str1,str2)){
            System.out.println("Strings are Anagram.");
        }
        else{
            System.out.println("Strings are not Anagram.");
        }
    }
}
