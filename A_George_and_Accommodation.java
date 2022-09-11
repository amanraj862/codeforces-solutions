import java.util.Scanner;

public class A_George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int ans = 0;
        while (n-- > 0) {
            int p = sn.nextInt();
            int q = sn.nextInt();
            if ((q - p) >= 2)
                ans++;
        }
        System.out.println(ans);
    }
}