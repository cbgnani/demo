public class combo {
    public static void main(String[] args){
        long n=1234567887654321l;
        long original=n;
        boolean isprime=true;
        int count=0;
        int even=0;
        int odd=0;
        long sdnum=0;
        long reverse=0;
        while(n!=0){
            long k=n%10;
            sdnum=sdnum+k;
            if(k%2==0){
                even++;
            }
            else{
                odd++;
            }
            count++;
            reverse=reverse*10+k;
            n=n/10;
        }
        System.out.println("numbers in the input= "+count+" even numbers = "+even+" odd numbers = "+odd+" -->sum of the digits in the num: "+sdnum);
        System.out.println("Reverse of a number: "+reverse);
        if(original==reverse){
            System.out.println(original+": is palindrome");
        }
        else{
            System.out.println(original+": is not palindrome");
        }
        if(original<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(original);i++){

                if(original%i==0)
                {
                    isprime=false;
                    break;
                }

            }

        }

        if(isprime){
            System.out.println(original+": prime");
        }
        else{
            System.out.println(original+": not prime");
        }


    }
}
