package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacterUsingTwoPointers {
    public static char mostFreqChar(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int maxFreq = -1;
        char ans = s.charAt(0);
        int i=0, j=0;
        while(j<s.length()){
            if(arr[i]==arr[j]) j++;
            else {
                if(maxFreq < j-i){
                    maxFreq = j-i;
                    ans = arr[i];
                }
                i=j;
            }
        }
        if(maxFreq < j-i){
            maxFreq = j-i;
            ans = arr[i];
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
