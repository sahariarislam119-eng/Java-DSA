package Metods;

import java.util.Scanner;

public class HelloWorldFunction {
    public static void hello(int a){
        for(int i=1;i<=a;i++) {
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        hello(a);
    }
}