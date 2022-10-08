import java.util.Scanner;

public class A_Boring_Apartments {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int n1 = n;
            n = n % 10;
            int l = 0;
            while (n1 > 0) {
                l = l + 1;
                n1 /= 10;
            }
            int ans = (10 * (n - 1) + (l * (l + 1) / 2));
            System.out.println(ans);
        }
    }
}