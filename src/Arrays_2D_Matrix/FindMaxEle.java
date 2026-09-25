package Arrays_2D_Matrix;

import java.util.Scanner;

public class FindMaxEle {
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
        int max = Integer.MIN_VALUE;
        int maxIdxRow = -1, maxIdxColumn = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                    maxIdxRow = i;
                    maxIdxColumn = j;
                }
            }
        }
        System.out.println("The max element = "+ max);
        System.out.println("The row and column of max element = ("+maxIdxRow+","+maxIdxColumn+")");
    }
}
