import java.util.Scanner;
public class yes {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        while(n-->0){
        String s=sn.next();
        s=s.toLowerCase();
        if(s.equals("yes"))
        System.out.println("YES");
        else
        System.out.println("NO");
        }

    }
}
