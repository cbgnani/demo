interface  bank{
    void pay(double amount);//abstract metghod
}
class upi implements bank{
    public void pay(double amount){
        System.out.println("by using the upi ="+amount);
    }
}
class card implements bank{ //if we declare interface then we use the implements keyword to get the method.

    public void pay(double amount){
        System.out.println("by using the card ="+amount);
    }
        }
public class interfaces {
    public static void main(String[] args){
        bank money=new upi();
        money.pay(3000);
        bank money1=new card();
        money1.pay(3000);
    }
}
