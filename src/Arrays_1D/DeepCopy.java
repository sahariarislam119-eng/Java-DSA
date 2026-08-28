package Arrays_1D;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] x = arr.clone();

        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;

        System.out.print("arr:");
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);

        System.out.print("x:");
        System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3]);
    }
}
