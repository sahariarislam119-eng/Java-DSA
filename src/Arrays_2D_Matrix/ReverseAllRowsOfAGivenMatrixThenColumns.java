package Arrays_2D_Matrix;

import java.util.Scanner;

public class ReverseAllRowsOfAGivenMatrixThenColumns {
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

    public static void arrayOutput(int[][] arr){
        System.out.println("Row and Column reversed array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = arrayInput();
        for(int i=0;i<arr.length;i++){
            int a=0,b=arr[0].length-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        for(int j=0;j<arr[0].length;j++){
            int a=0,b=arr.length-1;
            while(a<b){
                int temp = arr[a][j];
                arr[a][j] = arr[b][j];
                arr[b][j] = temp;
                a++;
                b--;
            }
        }
        arrayOutput(arr);
    }
}
