import java.util.Scanner;;
public class prop6 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int r ;
        double pi=3.1;
        double aoc;
        System.out.println("enter your radius ");
        r=ob.nextInt();
        aoc=pi*r*r;
        System.out.println(aoc);
        ob.close();
        
    }
    
}
