import java.util.Scanner;

public class A_Insomnia_cure {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int k = sn.nextInt();
        int l = sn.nextInt();
        int m = sn.nextInt();
        int n = sn.nextInt();
        int d = sn.nextInt();
        int[] arr = new int[d + 1];
        int j = 1;
        for (int i = k; i <= d; i = k * j) {
            arr[i] = k;
            j++;
        }
        j = 1;
        for (int i = l; i <= d; i = l * j) {
            arr[i] = l;
            j++;
        }
        j = 1;
        for (int i = m; i <= d; i = m * j) {
            arr[i] = m;
            j++;
        }
        j = 1;
        for (int i = n; i <= d; i = n * j) {
            arr[i] = n;
            j++;
        }
        int ans = 0;
        for (int i = 1; i <= d; i++) {
            if (arr[i] != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}