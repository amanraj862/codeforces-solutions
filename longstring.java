import java.util.Scanner;
public class longstring {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        while(n-->0){
            String s=sn.next();
            if(s.length()<=10)
            System.out.println(s);
            else{
                String ans=s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(s.length()-1);
            System.out.println(ans);
            }
        }
    }
}
