import java.util.Scanner;

public class A_Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int ans = 0;
            if ((n & 1) == 0) {
                ans = (n / 2) - 1;
            } else {
                ans = n / 2;
            }
            System.out.println(ans);
        }
    }
}