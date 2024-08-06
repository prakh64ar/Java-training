class GRANFATER {
    void grand(){
        System.out.println("hello");
    }
}
class PAPA extends GRANFATER {
 void papa()
 {
    System.out.println("hii");
 }
}
 class SON extends PAPA
 {
    void son(){
        System.out.println("hee");
    }
 }

public class con3 {
    public static void main(String[] args) {
        SON sc =new SON();
        sc.grand();
        sc.papa();
        sc.son();
    }
    
}

