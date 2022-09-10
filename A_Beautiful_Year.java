import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Beautiful_Year {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int y = sn.nextInt();
        int ans = y + 1;
        while (true) {
            if (dist(ans)) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean dist(int y) {
        Set<Integer> set1 = new HashSet<Integer>();
        while (y > 0) {
            int d = y % 10;
            set1.add(d);
            y = y / 10;
        }
        if (set1.size() == 4)
            return true;
        return false;
    }
}