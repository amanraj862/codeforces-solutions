import java.util.Scanner;

public class A_Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += (max - arr[i]);
        }
        System.out.println(total);
    }
}