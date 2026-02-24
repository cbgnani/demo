public class array13 {
    public static void main(String[] args){
        int n=10;
        int a=0;
        int b=1;
        int temp;
        System.out.print("fibonacci series up to "+n+" will be : " );
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            temp=a+b;
            a=b;
            b=temp;

        }
    }
}
