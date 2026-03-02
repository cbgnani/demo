public class arrrev {
    public static void main(String[] args){
        int n[]={1,2,3,4,7,8,9};
        int temp;
        int start=0;
        int end=n.length-1;
        while(start <=end){
            temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<=n.length-1;i++){
            System.out.print(n[i]+" ");
        }

    }
}
