import java.util.Scanner;

public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        boolean flag = true;
        while (n-- > 0) {
            int type = sn.nextInt();
            if (type == 1)
                flag = false;
        }
        if (flag)
            System.out.println("EASY");
        else
            System.out.println("HARD");

    }
}