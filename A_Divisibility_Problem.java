import java.util.Scanner;

public class A_Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            int ans = 0;
            if (a % b != 0)
                ans = b - (a % b);
            System.out.println(ans);
        }
    }
}