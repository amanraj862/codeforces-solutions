import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int ans = 0;
        while (n-- > 0) {
            String s = sn.next();
            if (s.charAt(0) == '+' || s.charAt(s.length() - 1) == '+')
                ans++;
            else
                ans--;
        }
        System.out.println(ans);
    }
}
