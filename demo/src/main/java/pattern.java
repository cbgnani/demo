public class pattern {
    public static void main(String[] args) {
        int n = 5;

        //multiplication table

        /*
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" ="+n*i);
        }*/

        //printing the triangle  patern

        /*for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        // for reversing the patern

        /*
        for (int i = n; i >= 0; i--) {

            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            */

        //pyramid and dimond pattern
        /*
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=0;i<=n;i++)
        {
            for (int l = 1; l <= i; l++) {

                System.out.print(" ");
            }
            for (int m = n; m >=i; m--) {
                System.out.print(" *");
            }

            System.out.println(" ");

        }
    }*/
        //numbers printing

        for(int i=n;i>=0;i--) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("" + j);
            }
            for (int k = 1; k <= n + 1 - i; k++) {
                System.out.print(" " + k);
            }
            System.out.println("l");
        }

            {
                for(int i=0;i<=n;i++) {
                    for (int j = 1; j <= i+1; j++) {
                        System.out.print(""+j);
                    }
                    for(int k=1;k<=n+1-i;k++){
                        System.out.print(" "+k);
                    }
                    System.out.println("l");
                }
            }
    }
}


