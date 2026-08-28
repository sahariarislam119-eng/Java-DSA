package Arrays_1D;

public class PassingArrayToMethods {
    public static void change(int [] y){
        System.out.println(y[2]);
        y[2]=99;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,3,8};
        change(arr);
        System.out.print(arr[2]);
    }
}
