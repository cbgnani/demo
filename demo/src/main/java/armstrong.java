public class armstrong {
    public static void main(String[] args){
        int n=2345;
        int original=n;
        int sum=0;
        while(n!=0){
            int k=n%10;
            sum=sum+k*k*k;
            n=n/10;
            int j=k;
        }
        System.out.println("value:"+sum);
        if(sum==original){
            System.out.println("arm string");
        }
        else{
            System.out.println("not armstring");
        }
    }
}
