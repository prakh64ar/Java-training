public class con2 {
    String Message;
    con2(String Message){
        this.Message=Message;
    }
    void display(){
        System.out.println("message "+Message);
    }
public static void main(String[] args) {
    con2 obj =new con2("hello word");
    obj.display();
    
}

    
}
