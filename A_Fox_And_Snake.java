import java.util.Scanner;

public class A_Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 != 0) {
                    System.out.print("#");
                }
                if (i % 2 == 0) {
                    if (!flag) {
                        if (j < m)
                            System.out.print(".");
                        if (j == m) {
                            System.out.print("#");
                            flag = true;
                        }

                    } else {
                        if (j == m)
                            flag = false;
                        if (j > 1)
                            System.out.print(".");
                        if (j == 1)
                            System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
    }
}