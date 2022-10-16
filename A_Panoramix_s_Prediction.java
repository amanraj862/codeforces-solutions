import java.util.Scanner;

public class A_Panoramix_s_Prediction {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int count = 0;
        boolean flag = false;
        ;
        if (isPrime(a) && isPrime(b))
            flag = true;

        for (int i = a; i <= b; i++) {
            if (isPrime(i))
                count++;
        }
        if (count == 2 && flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}