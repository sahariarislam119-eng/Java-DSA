package Arrays_1D;

import java.util.Scanner;

import java.util.ArrayList;

public class AddOneToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int k = sc.nextInt();
        System.out.print("Enter array elements: ");
        for (int i = 0; i < k; i++) {
            arr.add(sc.nextInt());
        }
        System.out.print("Array before adding 1: ");
        System.out.println(arr);
        int n = arr.size();
        for (int i = n - 1; i >= 0; i--) {
            if (arr.get(i) != 9) {
                arr.set(i, arr.get(i) + 1);
                break;
            }
            else {
                if (i == 0) {
                    arr.set(i, 0);
                    arr.add(0, 1);
                }
                else {
                    arr.set(i, 0);
                }
            }
        }
        System.out.print("Array after adding 1: ");
        System.out.println(arr);
    }
}
