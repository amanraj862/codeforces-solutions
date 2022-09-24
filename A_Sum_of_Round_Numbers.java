import java.util.Scanner;
import java.util.ArrayList;

public class A_Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        while (t-- > 0) {
            int pow = 1;
            ArrayList<Integer> arr = new ArrayList<>();
            int n = sn.nextInt();
            while (n > 0) {
                if (n % 10 > 0) {
                    arr.add((n % 10) * pow);
                }
                n /= 10;
                pow *= 10;
            }
            System.out.println(arr.size());
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}