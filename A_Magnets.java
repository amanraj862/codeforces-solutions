import java.util.Scanner;

public class A_Magnets {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = sn.next();
        String temp = s[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (temp.equals(s[i]))
                continue;
            count++;
            temp = s[i];
        }
        System.out.println(count);
    }
}