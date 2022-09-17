import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String a = sn.next();
        String b = sn.next();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) != b.charAt(i))
                ans.append('1');
            else
                ans.append('0');
            i++;
        }

        System.out.println(ans.toString());
    }

}