package Strings;

import java.util.Scanner;

public class MostFrequentCharacterUsingFreqArray {
    public static char mostFreqChar(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Most frequent character in the string "+str+" is "+mostFreqChar(str));
    }
}
