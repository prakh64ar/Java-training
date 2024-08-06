import java.util.Scanner;
public class lo {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
System.out.println("enter the week no");
    int day ;
    day=c.nextInt();
    switch (day) {
        
            case 1:
            System.out.println("mon");
            break;
            case 2:
            System.out.println("tus");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("thur");
            break;
            case 5:
            System.out.println("fri");
            break;
            case 6:
            System.out.println("sat");
            break;
            case 7:
            System.out.println("sun");
            break;
    
        default:
        System.out.println("no way");
            break;
    }
    c.close();
    }
    
}
