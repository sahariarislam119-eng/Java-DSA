package Arrays_1D;

import java.util.ArrayList;

public class ArrayListInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(60);
        arr.add(90);
        arr.add(96);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
