package Arrays_2D_Matrix;

import java.util.Scanner;

public class RotateMatrixBy90DegreeClockwise {
    public static int[][] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows & columns: ");
        int r = sc.nextInt();
        int[][] arr = new int[r][r];
        System.out.println("Enter array input: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = arrayInput();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            int a=0,b=arr.length-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        System.out.println("Rotated Matrix by 90 Degree clockwise: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
