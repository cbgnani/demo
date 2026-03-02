class fracton{
    private int number1;
    private int number2;
    public fracton(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }
    public int getnumber1(int number1){
        return number1;
    }
    public void setnumber1(){
        this.number1=number1;
    }
    public int getnumber2(int number2){
        return number2;
    }
    public void setnumber2(){
        if(number2==0){
            System.out.println("number2 cannot be zero.setting default value = 1");
            this.number2=1;
        }
        else{
            this.number2=number2;
        }

    }
    void display(){
        System.out.println("fraction = "+number1+" / "+number2);
    }
}
public class encapsulation {
    public static void main(String[] args){
        fracton obj=new fracton(23,0);
        obj.setnumber1();
        obj.setnumber2();
        System.out.println("fraction = "+obj.getnumber1(10)+" / "+obj.getnumber2(5));
        obj.display();
    }
}
