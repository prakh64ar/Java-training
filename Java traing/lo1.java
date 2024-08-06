import java.util.Scanner;

public class lo1 {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in );
        System.out.println("enter you month no.");
        int month;
        month =c.nextInt();
        switch (month) {
            
            case 1:
                System.err.println("jan");
                break;
                case 2:
                System.err.println("feb");
                break;
                case 3:
                System.err.println("mar");
                break;
                case 4:
                System.err.println("april");
                break;
                case 5:
                System.err.println("may");
                break;
                case 6:
                System.err.println("june");
                break;
                case 7:
                System.err.println("jul");
                break;
                case 8:
                System.err.println("aug");
                break;
                case 9:
                System.err.println("sep");
                break;
                case 10:
                System.err.println("oct");
                break;
                case 11:
                System.err.println("nov");
                break;
                case 12:
                System.err.println("dec");
                break;

        
            default:
            System.out.println("get lost");
                break;
        }
        c.close();
    }
}
