package Recursion;

public class LinearSearch {
    public static boolean search(int[] arr, int ele, int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return search(arr,ele,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int ele = 53;
        if(search(arr,ele,0)) System.out.println("Element present in array.");
        else System.out.println("Element not present in array.");
    }
}
