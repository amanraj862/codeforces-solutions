import java.util.Scanner;

public class A_Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        long n = sn.nextLong();
        int count = 0;

        while (n > 0) {
            int d = (int) (n % 10);

            if (d == 4 || d == 7)
                count++;
            n = n / 10;
        }

        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}