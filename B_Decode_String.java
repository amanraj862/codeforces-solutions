import java.util.Scanner;

public class B_Decode_String {
    static char get(int i) {
        return (char) ('a' + i - 1);
    }

    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            int t = sn.nextInt();
            while (t-- > 0) {
                int n = sn.nextInt();
                String s = sn.next();
                int i = n - 1;
                String res = "";
                while (i >= 0) {
                    if (s.charAt(i) != '0') {
                        res += get(s.charAt(i) - '0');
                        i--;
                    } else {
                        res += get(Integer.valueOf(s.substring(i - 2, i)));
                        i -= 3;
                    }
                }
                // res.reverse();
                StringBuilder str = new StringBuilder(res);
                System.out.println(str.reverse().toString());
            }
        }
    }
}