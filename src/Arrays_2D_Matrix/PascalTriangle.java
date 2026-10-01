package Arrays_2D_Matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static ArrayList<ArrayList<Integer>> pas(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i) ans.get(i).add(1);
                else{
                    int x = ans.get(i-1).get(j-1);
                    int y = ans.get(i-1).get(j);
                    ans.get(i).add(x+y);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr = pas(n);
        System.out.println(arr);
    }
}
