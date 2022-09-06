import java.util.Scanner;

public class A_Accumulation_of_Dominoes {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        long n = sn.nextLong();
        long m = sn.nextLong();
        long ans = 0;
        if (m == 1)
            System.out.println(n - 1);
        else {
            ans = n * (m - 1);
            System.out.println(ans);
        }
    }
}