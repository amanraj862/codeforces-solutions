import java.util.Scanner;

public class A_Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int i = 0;
        int sum = 0;
        while (sum <= n) {
            for (int j = 1; j <= i; j++) {
                sum += j;
                if (sum > n)
                    break;
            }
            // System.out.println(sum);
            i++;
        }
        System.out.println(i - 2);
    }
}