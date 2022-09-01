import java.util.Scanner;

public class A_Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int a = 0;
        String games = sn.next();
        for (int i = 0; i < games.length(); i++) {
            char ch = games.charAt(i);
            if (ch == 'A')
                a++;
        }
        if (a > (n - a))
            System.out.println("Anton");
        else if ((n - a) > a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}