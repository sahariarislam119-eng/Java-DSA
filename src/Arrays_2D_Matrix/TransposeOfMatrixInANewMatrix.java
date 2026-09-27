package Arrays_2D_Matrix;

import java.util.Scanner;

public class TransposeOfMatrixInANewMatrix {
    public static int[][] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
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
//        Created empty matrix.
        int[][] brr = new int[arr[0].length][arr.length];
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
