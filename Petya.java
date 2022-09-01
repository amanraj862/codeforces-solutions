import java.util.Scanner;

public class Petya {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s1 = sn.next();
        String s2 = sn.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.compareTo(s2) == 0)
            System.out.println("0");
        else if (s1.compareTo(s2) > 0)
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
