import java.util.Scanner;

public class borg {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        int arr[] = new int[26];
        for (int i = 0; i < 26; i++)
            arr[i] = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
            if (arr[i] >= 1)
                count++;
        if ((count & 1) == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
