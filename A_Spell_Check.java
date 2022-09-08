import java.util.Arrays;
import java.util.Scanner;

public class A_Spell_Check {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String name = "Timru";
        int t = sn.nextInt();
        while (t-- > 0) {
            int n = sn.nextInt();
            String s = sn.next();
            if (n != 5) {
                System.out.println("NO");
                continue;
            } else {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String name1 = new String(ch);
                if (name1.equals(name))
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }

        }
    }
}