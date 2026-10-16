package Recursion;

public class BinarySearch {

    public static int binarySearch(int[] arr,int ele, int low, int high){
        if(low>high) return -1;
        int mid = low + (high - low)/2;
        if(arr[mid]==ele) return mid;
        else if(arr[mid]>ele) return binarySearch(arr,ele,0,mid-1);
        else return binarySearch(arr,ele,mid+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,9,8,5,3,10,4,56,8};
        int ele = 2;
        int x = binarySearch(arr,ele,0, arr.length-1);
        System.out.println("The index of element: "+x);
    }
}
