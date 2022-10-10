import java.util.Scanner;

public class A_Floor_Number {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int x = sn.nextInt();
            int i = 1;
            if (n <= 2) {
                System.out.println(1);
            } else {
                while (n > (i * x + 2)) {
                    i = i + 1;
                }
                System.out.println(i + 1);
            }
        }
    }
}