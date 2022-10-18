import java.util.Scanner;

/**
 * A_Lucky
 */
public class A_Lucky {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            String s = sn.next();
            int i = 0;
            int j = s.length() - 1;
            int sumf = 0;
            int suml = 0;
            while (i < j) {
                sumf += s.charAt(i) - '0';
                suml += s.charAt(j) - '0';
                i++;
                j--;
            }
            if (sumf == suml)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}