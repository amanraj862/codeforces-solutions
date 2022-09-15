import java.util.Scanner;

public class B_Drinks {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int t = n;
        double sum = 0;
        while (t-- > 0) {
            int p = sn.nextInt();
            sum += p;
        }
        double ans = sum / n;
        System.out.printf("%.12f", ans);
    }
}