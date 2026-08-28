package Arrays_1D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddOneToArray2ndApproach {

    public static ArrayList<Integer> addOne(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length-1;
        int carry = 1;
        for(int i=n;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.print("Enter array elements:");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = addOne(arr);
        System.out.print("Array after adding 1: ");
        System.out.println(answer);
    }
}