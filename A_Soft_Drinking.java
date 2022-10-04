import java.util.Scanner;

public class A_Soft_Drinking {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        int l = sn.nextInt();
        int c = sn.nextInt();
        int d = sn.nextInt();
        int p = sn.nextInt();
        int nl = sn.nextInt();
        int np = sn.nextInt();

        int kl = k * l;
        int dtoast = kl / nl;
        int cd = c * d;
        int tsalt = p / np;
        int imin = Math.min(dtoast, cd);
        int fmin = Math.min(imin, tsalt);
        System.out.println(fmin / n);

    }
}