import java.util.Scanner;
public class watermelon {
    public static void main(String[] args) {
      Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        if(n==2)
        System.out.println("YES");
        if((n%2)==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
