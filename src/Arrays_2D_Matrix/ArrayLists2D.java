package Arrays_2D_Matrix;

import java.util.ArrayList;

public class ArrayLists2D {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(25); b.add(67); b.add(56);
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        arr.add(a); arr.add(b);
        System.out.println(arr);
    }
}