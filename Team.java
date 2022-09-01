import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        int ans = 0;
        while (t-- > 0) {
            int arr[] = new int[3];
            int c = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = sn.nextInt();
                if (arr[i] == 1)
                    c++;
            }
            if (c >= 2)
                ans++;
        }
        System.out.println(ans);
    }
}
