import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String s = sn.next();
        char prev = s.charAt(0);
        int i = 1;
        int ans = 0;
        while (i < n) {
            char curr = s.charAt(i);
            if (curr == prev)
                ans++;
            prev = curr;
            i++;
        }
        System.out.println(ans);
    }
}
