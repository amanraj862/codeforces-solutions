import java.util.Scanner;

/**
 * A_Do_Not_Be_Distracted
 */
public class A_Do_Not_Be_Distracted {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            String s = sn.next();
            boolean flag = true;
            for (char c = 'A'; c <= 'Z'; c++) {
                int first = n;
                int last = -1;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == c) {
                        first = Math.min(first, i);
                        last = Math.max(last, i);
                    }
                }

                for (int i = first; i <= last; i++) {
                    if (s.charAt(i) != c) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }
    }
}