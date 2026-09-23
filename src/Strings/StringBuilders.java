package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Sahariar");
        System.out.println(s);
        s.append(" Islam");
        System.out.println(s);
        System.out.println(s.capacity());
        s.setCharAt(0,'s');
        s.setCharAt(9,'i');
        System.out.println(s);
    }
}
