import java.util.Scanner;

public class A_Presents {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sn.nextInt();
        }
        int[] newArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            newArr[arr[i]] = i;
        }
        for (int i = 1; i <= n; i++)
            System.out.print(newArr[i] + " ");
    }
}