package Recursion;

import java.util.Scanner;

public class UniquePaths {
    public static int paths(int r, int c){
        if(r==1||c==1) return 1;
        return paths(r-1,c)+paths(r,c-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        System.out.print("Number of unique paths: "+paths(r,c));
    }
}
