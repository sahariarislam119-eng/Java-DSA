package Basics_of_JAVA;

public class CharDataType {
    public static void main(String[] args) {
        char saad = 'A';
        System.out.println(saad);

        // Type casting
        int x = saad;
        System.out.println(x);

        //Explicit Type casting
        System.out.println((int) saad);

        //Another way to print ASCII value
        System.out.println(saad + 0);
        System.out.println(saad * 1);

    }
}
