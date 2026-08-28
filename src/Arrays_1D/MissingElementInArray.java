package Arrays_1D;

import java.util.Scanner;
import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println("The missing element = "+(i+1));
                break;
            }
        }
    }
}
