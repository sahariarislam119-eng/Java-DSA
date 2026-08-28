package Arrays_1D;

public class OddIndexElementMultipliedBy2AndEvenIndexElementAdd10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) arr[i] = arr[i] * 2;
            else arr[i] = arr[i] + 10;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("Arr: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
