import java.util.Arrays;
import java.util.Scanner;

public class A_Remove_Smallest {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sn.nextInt();
            Arrays.sort(arr);
            int i;
            for (i = 0; i < n - 1; i++) {
                if ((arr[i + 1] - arr[i]) <= 1)
                    continue;
                else
                    break;
            }
            if (i == n - 1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }

}