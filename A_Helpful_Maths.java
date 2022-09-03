import java.util.*;
//import java.util.Scanner;

public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        String sarr[] = s.split("\\+");
        Arrays.sort(sarr);
        StringBuilder sbr = new StringBuilder();
        for (int i = 0; i < sarr.length; i++) {
            sbr.append(sarr[i]);
            sbr.append("+");
        }
        System.out.println(sbr.toString().substring(0, sbr.length() - 1));

    }
}