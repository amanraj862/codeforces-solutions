import java.util.Scanner;

public class A_Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++)
            arr[i] = sn.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++)
            max = Math.max(max, arr[i]);
        for (int i = 0; i < 4; i++) {
            int a = max - arr[i];
            if (a > 0)
                System.out.print(a + " ");
        }
    }
}