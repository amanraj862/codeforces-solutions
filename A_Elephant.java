import java.util.Scanner;

public class A_Elephant {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int step = 0, ans = 0;
        while (step < n) {
            step += 5;
            ans += 1;
        }
        System.out.println(ans);
    }
}