import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        String s1 = s.substring(0, 1);
        s1 = s1.toUpperCase();
        String s2 = s.substring(1, s.length());
        String ans = s1 + s2;
        System.out.println(ans);
    }
}
