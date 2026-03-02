public class array2 {
    public static void main(String[] args){
        int n[]={10,20,30,40,20};

        /*for(int i=0;i<n.length;i++){
            //System.out.println(i);
            if(i%2==0){
                System.out.println(n[i]);
            }
            *//*else{
                System.out.println(n[i]);
            }*//*
        }*/
        //int min=0;
        boolean sorted=true;
        for(int i=0;i<n.length-1;i++){
            if(n[i]>n[i+1]){
                sorted=false;
                break;
            }

        }
        if(sorted) {
            System.out.println("sorted array");
        }
        else{
            System.out.println("not sorted array");

        }
    }
}
