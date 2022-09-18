import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Set<Integer> st = new LinkedHashSet<Integer>();
        for (int i = 1; i <= 4; i++) {
            int n = sn.nextInt();
            st.add(n);
        }
        System.out.println(4 - st.size());
    }
}