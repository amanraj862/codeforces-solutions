import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int ans = 0;
        while (a <= b) {
            a = a * 3;
            b = b * 2;
            ans++;
        }
        System.out.println(ans);
    }
}
