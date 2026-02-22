public class allpatern {
    public static void main(String[] args) {

        //patern printing

        //int n = 5;
        /*for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print("  ");
            }
            for(int b=1;b<=n-i;b++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
            for (int i = 1; i <= n; i++) {
                for (int k = 0; k <= n - i; k++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k <= n - i; k++) {
                    System.out.print(" *");
                }

                System.out.println();
            }

         */


        //letter patern printing


        int n=7;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || j==n || i == j && i<=(n/2)+1 || i+j == n+1 && i<=(n/2)+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+3; j++) {
                    if (j == 1 || i == 1 && j<=n || j == n && i<=(n/2)||i==n/2 && j<=n||i== j && i>=(n/2)+1 || i==n && j>n+1 && j!=n+3) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || i == 1 && j!=n+1 || i == n && j!=n+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
               //

                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || i == 1 && j!=n && j!=n+1|| i == n && j!=n && j!=n+1||i==(n/2)+1 && j!=n && j!=n+1 ||j==n && i!=1 && i!=(n/2)+1 && i!=n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || i == 1 && j!=n+1 || i == n && j!=n+1||i==(n/2)+1 && j>=(n/2) && j!=2 && j!=n+1|| j==n && i>=(n/2)+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || j == n || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (i == 1 && j!=1 && j!=n && j!=n+1 || j == n && i!=1|| j == 1 && i!=1||i==(n/2)+1 && j!=n+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (j == 1 || j == n || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for (int j = 1; j <= n+1; j++) {
                    if (i == 1 && j<=n || i == n && j<=n|| j == (n/2)+1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
}
