public class Asearch {
    public static void main(String[] args){
        int n[]={12,26,34,46,59};
        int key=3;
        boolean found=true;
        for(int i=0;i<n.length;i++) {
            if (key == n[i]) {
                found = false;
                System.out.println("it is at the index position "+i);
                break;
            }
        }
        if(found) {
            System.out.println("Element not in the array,so not found "+key);
        }
        else{
            System.out.println("Element found ="+key);
        }
    }
}
