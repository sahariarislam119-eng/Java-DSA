package Arrays_1D;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        int[] x = arr;
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
    }
}
