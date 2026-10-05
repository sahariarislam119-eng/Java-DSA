package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        name(0);
    }

    public static void name(int n){
        if(n==5) return;
        System.out.println("Sahariar");
        name(n+1);
    }
}
