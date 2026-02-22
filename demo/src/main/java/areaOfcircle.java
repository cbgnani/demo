public class areaOfcircle {
    public static void main(String[] args){
        //area of circle
        /*int radious=19;
        double A;
        A=Math.PI*(radious*radious);
        System.out.println(A);

         */

        //convert celcious to farenhiet

        /*
        int c=70;
        double fhiet;
        fhiet=c*1.8+32;
        System.out.println(fhiet);

         */

        //average of three numbers

        /*
        int a[]={5,6,7,8,9,9,4,6,7,8};
        int b=a.length;
        int sum=0;
        for(int i=0;i<=b-1;i++){
            sum=sum+a[i];
        }
        int avg=sum/b;
        System.out.println("sum: "+sum+"\naverage: "+avg);

         */

        //simple interest
        /*
        int P=150000;
        int R=5;
        int T=2;
        int si=P*R*T/100;
        System.out.println(si);

         */
        //check number is divisible by both numbers
/*
        int a=15;
        if(a%3==0 && a%5==0){
            System.out.println(a+" is divisible by both numbers");
        }
        else{
            System.out.println(a+" is not divisible by both numbers");
        }

 */
        //relational operatpr using boolean
        /*
       int a=2;
       int b=4;
       boolean c=true;
       boolean areEqul=(a<b);
           System.out.println(areEqul);

         */


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
