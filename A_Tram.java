import java.util.Scanner;

public class A_Tram {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int i = 1;
        int ans = 0;
        int cap = 0;
        while (i <= n) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            cap = cap - a;
            cap = cap + b;
            if (cap > ans)
                ans = cap;
            i++;
        }
        System.out.println(ans);
    }
}