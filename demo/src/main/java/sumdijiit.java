public class sumdijiit {
    public static void main(String[] args){
        int n=1234;
        int c=0;
        while(n!=0){
            int k=n%10;
            c=c+k;
            n=n/10;
        }
        System.out.println("value:"+c);
    }
}
