import java.util.Scanner;

public class A_Square_String {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            String s = sn.next();
            if ((s.length() & 1) == 1) {
                System.out.println("NO");
            } else {
                String s1 = s.substring(0, s.length() / 2);
                String s2 = s.substring(s.length() / 2, s.length());
                if (s1.equals(s2))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
