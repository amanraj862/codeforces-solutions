import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sn.nextInt();
        int ans = 0;
        int score = arr[k - 1];
        for (int i = 0; i < n; i++) {
            if ((arr[i] >= score) && arr[i] > 0)
                ans++;
        }
        System.out.println(ans);
    }
}