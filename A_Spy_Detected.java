import java.util.Arrays;
import java.util.Scanner;

public class A_Spy_Detected {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sn.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = arr[i];
            Arrays.sort(a);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != a[1])
                    ans = i + 1;
            }
            System.out.println(ans);
        }
    }
}