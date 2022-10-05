import java.util.Scanner;

public class A_Marathon {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            int c = sn.nextInt();
            int d = sn.nextInt();
            int ans = 0;
            if (b > a)
                ans++;
            if (c > a)
                ans++;
            if (d > a)
                ans++;
            System.out.println(ans);

        }
    }
}