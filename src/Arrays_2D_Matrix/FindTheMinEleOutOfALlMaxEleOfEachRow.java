package Arrays_2D_Matrix;

import java.util.Scanner;

public class FindTheMinEleOutOfALlMaxEleOfEachRow {
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
        int minEle = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int maxEle = Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>maxEle) maxEle = arr[i][j];
            }
            if(maxEle<minEle) minEle=maxEle;
        }
        System.out.println("The minimum element out of all the maximum elements of each row = "+minEle);
    }
}
