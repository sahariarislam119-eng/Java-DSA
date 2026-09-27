package Arrays_2D_Matrix;

import java.util.Scanner;

public class PrintMatrixInSnakePatternVertically {
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
        System.out.println("Matrix in snake pattern Vertically: ");
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int k=arr.length-1;k>=0;k--){
                    System.out.print(arr[k][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
