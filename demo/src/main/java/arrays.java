import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int n[]={19,1,34,4,88,99,101,1000,1200,58};
        int len=n.length;
        int max=n[0];
        int secMax=n[0];
        /*
        // without using second forloop

        for(int i=1;i<len;i++) {
            if(n[i]>secMax&&n[i]<max)
                secMax=n[i];
            if(n[i]>max){
                if(secMax<max)
                    secMax=max;
                max=n[i];
            }
        }
        //another code one

         for(int i=0;i<len;i++) {
            if (n[i] > max) {
                secMax=max;
                max = n[i];
            }
            if (n[i] > secMax && n[i]!=max) {
                secMax = n[i];
            }
        }
        */
        // in built functions

        /*Arrays.sort(n);
        System.out.println(n[len-9]);*/

        //using second for loop

        for(int i=0;i<len;i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
            for(int i=0;i<len;i++){
            if (n[i] > secMax && n[i]!=max) {
                secMax = n[i];
            }
        }
        System.out.println("maximum value : "+max);
        System.out.println("second maximum value : "+secMax);
    }
}

