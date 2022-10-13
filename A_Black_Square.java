import java.util.Scanner;

public class A_Black_Square {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++)
            arr[i] = sn.nextInt();
        String s = sn.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - '0';
            count += arr[ch - 1];
        }
        System.out.println(count);
    }
}