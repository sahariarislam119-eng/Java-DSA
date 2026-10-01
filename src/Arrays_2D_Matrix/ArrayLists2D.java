package Arrays_2D_Matrix;

import java.util.ArrayList;

public class ArrayLists2D {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(11); b.add(22); b.add(33);
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        arr.add(a); arr.add(b);
        System.out.println(arr);
//        Print like 2D Array
        System.out.println("Using For loop: ");
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
//        Using For each Loop
        System.out.println("Using For Each Loop: ");
        for(ArrayList<Integer> list: arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}