import java.util.Scanner;

public class A_Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            if (Math.abs(a - b) % 10 > 0)
                System.out.println((int) (Math.abs(a - b) / 10) + 1);
            else
                System.out.println((int) (Math.abs(a - b) / 10));
        }
    }
}