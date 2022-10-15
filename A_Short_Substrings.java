import java.util.Scanner;

public class A_Short_Substrings {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            String s = sn.next();
            String a = s.substring(0, 2);

            for (int i = 3; i < s.length(); i += 2) {
                a += s.charAt(i);
            }
            System.out.println(a);
        }
    }
}