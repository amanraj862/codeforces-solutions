import java.util.HashSet;
import java.util.Scanner;

public class A_Image {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        HashSet<Character> imagesSet = new HashSet<>();
        while (n-- > 0) {
            String s1 = sn.next();
            String s2 = sn.next();
            imagesSet.add(s1.charAt(0));
            imagesSet.add(s1.charAt(1));
            imagesSet.add(s2.charAt(0));
            imagesSet.add(s2.charAt(1));

            switch (imagesSet.size()) {
                case 1:
                    System.out.println("0");
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    System.out.println("2");
                    break;
                case 4:
                    System.out.println("3");
                    break;
            }

            imagesSet.clear();

        }
    }
}