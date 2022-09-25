import java.util.Scanner;

public class A_Police_Recruits {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int sum = 0;
        int ans = 0;
        while (n-- > 0) {
            int act = sn.nextInt();
            if (act > 0)
                sum += act;
            else {
                if (sum > 0)
                    sum = sum + act;
                else
                    ans++;
            }
        }
        System.out.println(ans);
    }
}