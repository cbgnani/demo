public class array13 {
    public static void main(String[] args){
        int n[]={10,5,6,7,8};
        int a[]={3,5,6,7,8};
        int res[]= new int[n.length+a.length];
        /*
        int sumAray[]=new int[n.length];
        if(n.length==a.length) {
            for (int i = 0; i < n.length ; i++) {
                sumAray[i] = n[i] + a[i];
            }
            System.out.println("sum array:=");
            for (int i = 0; i < sumAray.length; i++) {
                System.out.println(sumAray[i] + " ");
            }
        }
        else{
            System.out.println("aray lengths must be in same length");
        }*/

        //merge two arrays and print the new array
        for(int i=0;i<n.length;i++){
            res[i]=n[i];
        }
        for(int i=0;i<a.length;i++){
            res[n.length+i]=a[i];
        }
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
