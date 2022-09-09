import java.util.Scanner;

public class A_Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int h = sn.nextInt();
        int ans = 0;
        while (n-- > 0) {
            int h1 = sn.nextInt();
            if (h1 > h)
                ans += 2;
            else
                ans += 1;
        }
        System.out.println(ans);
    }
}