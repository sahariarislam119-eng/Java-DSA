package Arrays_2D_Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
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
        int[][] brr = arrayInput();
        if (arr[0].length != brr.length) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int[][] ans = new int[arr.length][brr[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                int sum=0;
                for(int k=0;k<arr[0].length;k++){
                    sum+= (arr[i][k]*brr[k][j]);
                }
                ans[i][j]=sum;
            }
        }
        System.out.println("Multiplied matrix: ");
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
