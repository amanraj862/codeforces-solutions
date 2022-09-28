import java.util.Scanner;

public class A_Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int ans1 = 0;
        while (a > 0 && b > 0) {
            a--;
            b--;
            ans1++;
        }
        int ans2 = 0;
        while (a >= 2) {
            a = a - 2;
            ans2++;
        }
        while (b >= 2) {
            b = b - 2;
            ans2++;
        }
        System.out.println(ans1 + " " + ans2);
    }
}