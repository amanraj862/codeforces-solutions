import java.util.Scanner;

public class A_Translation {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        String t = sn.next();
        if (isReverse(s, t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isReverse(String s, String t) {
        int n = s.length();
        int l = t.length();
        if (n != l)
            return false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(n - i - 1))
                return false;
        }
        return true;
    }
}