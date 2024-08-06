public class lo8 {
    public static void main(String[] args) {
        int n=12345;
        int reversed=0;
        int digit;
        while (n!=0) {
             digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
            
        }
        System.out.println("reversed"+reversed);
    }
}
