import java.util.Scanner;

public class A_Sum {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            int c = sn.nextInt();
            if ((a + b) == c || (b + c) == a || (a + c) == b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}