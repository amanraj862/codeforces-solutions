import java.util.Scanner;

public class A_Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        for (int i = 1; i <= k; i++) {
            if (n % 10 == 0)
                n = n / 10;
            else
                n = n - 1;
        }
        System.out.println(n);
    }
}