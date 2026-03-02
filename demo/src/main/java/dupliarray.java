public class dupliarray {
    public static void main(String[] args) {
        int n[] = {1,1,2,2,5,3,4,2,5,5,6};
        for (int i = 0; i < n.length; i++) {
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(n[i]==n[j]){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate==false){
                System.out.print(n[i]+" ");
            }
        }
    }
}
