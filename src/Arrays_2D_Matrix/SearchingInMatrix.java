package Arrays_2D_Matrix;

import java.util.Scanner;

public class SearchingInMatrix {
    public static int[][] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter array input: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static boolean search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            int low=0, high=arr[i].length-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[i][mid]==target) return true;
                else if(arr[i][mid]<target) low = mid+1;
                else if(arr[i][mid]>target) high = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = arrayInput();
        System.out.print("Enter target element: ");
        int x = sc.nextInt();
        boolean flag = search(arr,x);
        if(flag) System.out.println("Target present in matrix.");
        else System.out.println("Target does not present in matrix.");
    }
}
