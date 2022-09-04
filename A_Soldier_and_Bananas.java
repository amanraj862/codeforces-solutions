import java.util.Scanner;

public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int k = sn.nextInt();
        int n = sn.nextInt();
        int w = sn.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= w) {
            sum = sum + (i * k);
            i++;
        }
        int ans = sum - n;
        if (ans <= 0) {
            System.out.println(0);
        } else
            System.out.println(ans);

    }
}