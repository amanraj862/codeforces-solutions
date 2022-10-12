import java.util.Scanner;

public class A_Fafa_and_his_Company {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int rem = n - i;
            if (rem % i == 0)
                count++;
        }
        System.out.println(count);
    }
}