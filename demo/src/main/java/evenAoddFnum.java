public class evenAoddFnum {
    public static void main(String[] args){
        int n=1243567;
        int s=0;
        int y=0;
        while(n!=0){
            int k=n%10;
            if(k%2==0){
                System.out.println(k+"even");
                s++;
            }
            else{
                System.out.println(k+"odd");
                y++;
            }
            n=n/10;

        }
        System.out.println("total even num:"+s);
        System.out.println("total odd num:"+y);
    }
}
