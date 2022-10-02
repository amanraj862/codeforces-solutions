import java.util.Scanner;

public class A_Design_Tutorial_Learn_from_Math {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        if ((n & 1) == 0)
            System.out.println((n - 8) + " " + 8);
        else
            System.out.println(n - 9 + " " + 9);
    }
}