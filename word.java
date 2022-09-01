import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.next();
        int upperCase=0;
        int lowerCase=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65&&ch<=90)
            upperCase++;
            else
            lowerCase++;
        }
        if(upperCase>lowerCase)
        System.out.println(s.toUpperCase());
        else
        System.out.println(s.toLowerCase());
    }
}
