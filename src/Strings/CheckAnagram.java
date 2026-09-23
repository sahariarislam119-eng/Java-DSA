package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;

        int[] arr = new int[s1.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)s1.charAt(i);
        }
        Arrays.sort(arr);

        int[] brr = new int[s2.length()];
        for(int i=0;i<brr.length;i++){
            brr[i]=(int)s2.charAt(i);
        }
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
