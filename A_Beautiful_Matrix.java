import java.util.Scanner;

public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int mat[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                mat[i][j] = sn.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                if (mat[i][j] == 1)
                    ans = Math.abs(j - 2) + Math.abs(i - 2);
        }

        System.out.println(ans);

    }
}