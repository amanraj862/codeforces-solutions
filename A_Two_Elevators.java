import java.util.Scanner;

public class A_Two_Elevators {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            int c = sn.nextInt();
            int elevator1 = Math.abs(a - 1);
            int elevator2 = Math.abs(b - c) + Math.abs(c - 1);
            if (elevator1 < elevator2)
                System.out.println(1);
            else if (elevator1 > elevator2)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}