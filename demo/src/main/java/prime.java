public class prime {
    public static void main(String[] args){
        int n=75;
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isprime = false;
                    break;
                }

            }
        }


        if(isprime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}
