import java.util.Scanner;

public class A_Calculating_Function {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        long n = sn.nextLong();
        if ((n & 1) == 0)
            System.out.println(n / 2);
        else
            System.out.println((-1) * ((n / 2) + 1));

    }
}