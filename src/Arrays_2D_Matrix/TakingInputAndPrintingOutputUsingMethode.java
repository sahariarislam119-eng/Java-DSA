package Arrays_2D_Matrix;

import java.util.Scanner;

public class TakingInputAndPrintingOutputUsingMethode {
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

    public static void arrayOutput(int[][] arr){
        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = arrayInput();
        arrayOutput(arr);
    }
}
