import java.util.Scanner;

public class us6 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter your fist number");
        a=ob.nextInt();
        System.out.println("enter your second number");
        b=ob.nextInt();
        c=a-b;
        System.out.println(c);
        ob.close();
    }
}