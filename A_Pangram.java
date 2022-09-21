import java.util.Scanner;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String s = sn.next();
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        s = s.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] < 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}