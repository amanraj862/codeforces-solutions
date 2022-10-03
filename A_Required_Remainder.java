import java.util.Scanner;

public class A_Required_Remainder {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int x = sn.nextInt();
            int y = sn.nextInt();
            int n = sn.nextInt();
            if (n - n % x + y <= n) {
                System.out.println(n - n % x + y);
            } else {
                System.out.println(n - n % x - (x - y));
            }
        }
    }
}