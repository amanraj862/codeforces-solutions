import java.util.Scanner;

public class A_Chip_Game {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int m = sn.nextInt();
            if (((n + m) & 1) == 0)
                System.out.println("Tonya");
            else
                System.out.println("Burenka");
        }

    }
}