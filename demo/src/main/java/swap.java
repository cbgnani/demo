public class swap {
    public static void main(String[] args) {

        //without third variable
        /*
        int a=2;
        int b=4;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+"\nb: "+b);

         */

        //with third variable
        /*
        int a=5;
        int b=8;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+"&"+b);

         */
        int a = 5;
        for (int i = a; i >= 0; i--) {
            for (int j = 1; j <=a+1-i; j++) {
                System.out.print("*");
            }
            //System.out.println();
            for (int k = 1; k <=i+1; k++) {
                System.out.print(" " + k);
            }

            System.out.println();
        }


        }


    }



