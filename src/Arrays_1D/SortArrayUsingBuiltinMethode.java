package Arrays_1D;

import java.util.Arrays;

public class SortArrayUsingBuiltinMethode {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,9,0,34,-3,6,-8,-23};
        printArray(arr);
        Arrays.sort(arr);
        System.out.println();
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("Arr: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
