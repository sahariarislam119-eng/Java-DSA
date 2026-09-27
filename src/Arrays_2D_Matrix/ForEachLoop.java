package Arrays_2D_Matrix;

import java.util.Scanner;

public class ForEachLoop {
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

    public static void main(String[] args) {
        int[][] arr = arrayInput();
        System.out.println("Array Output: ");
        for(int[] a : arr){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
