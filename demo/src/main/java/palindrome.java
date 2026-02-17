public class palindrome {
    public static void main(String[] args){
        int l=12321;
        int or=l;
        int reverse=0;
        while (l!=0)
        {
            int n=l%10;
            reverse=reverse*10+n;
            l=l/10;

        }
        System.out.println("rev:"+reverse);
        if (or==reverse)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
