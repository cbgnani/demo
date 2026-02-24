public class reverse {
    public static void main(String[] args){
        /*
        int n[]={1,2,3,4,5};
        int o[]={1,2,3,4,5};
        int len=n.length;
        int start=0;
        int end=len-1;

        while (start < end) {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;

        }
            System.out.println("reveresed elements ");
        for(int i=0;i<=n.length-1;i++){

            System.out.print(n[i]+" ");
    }

         */
        String a="nksdnn";
        int len=a.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(a.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
