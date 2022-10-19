import java.util.Scanner;

/**
 * A_Add_Odd_or_Subtract_Even
 */
public class A_Add_Odd_or_Subtract_Even {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            if (a == b)
                System.out.println(0);
            else if (((a > b) && ((a - b) % 2 == 0)) || ((a < b) && ((b - a) % 2 != 0)))
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}