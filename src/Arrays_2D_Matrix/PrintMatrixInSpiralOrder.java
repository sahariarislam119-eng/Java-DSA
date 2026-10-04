package Arrays_2D_Matrix;

import java.util.Scanner;

public class PrintMatrixInSpiralOrder {
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
        int fc=0, lc=arr[0].length-1, fr=0, lr=arr.length-1;
        while(fr <= lr && fc <= lc){
            for(int j=fc;j<=lc;j++){
                System.out.print(arr[fr][j]+" ");
            }
            fr++;
            if(fr > lr || fc > lc) break;
            for(int i=fr;i<=lr;i++){
                System.out.print(arr[i][lc]+" ");
            }
            lc--;
            if(fr > lr || fc > lc) break;
            for(int j=lc;j>=fc;j--){
                System.out.print(arr[lr][j]+" ");
            }
            lr--;
            if(fr > lr || fc > lc) break;
            for(int i=lr;i>=fr;i--){
                System.out.print(arr[i][fc]+" ");
            }
            fc++;
        }
    }
}
