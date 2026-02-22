import java.util.Random;
import java.util.Scanner;
public class operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Random rand=new Random();
        System.out.println("enter the size: ");
        int size=sc.nextInt();
        int n[]=new int[size];
        int len=n.length;
        String poslist=" ";
        String neglist=" ";
        int postv=0;
        int negtv=0;
        int sum=0;
        for(int i=0;i<=len-1;i++){
            n[i]=rand.nextInt(100)-50;
            if(n[i]>=0){
                //System.out.println(n[i]+" is positive");
                sum+=n[i];
                poslist+=n[i]+" ";
                postv++;
            }
            else{
                //System.out.println(n[i]+" is negative");
                sum+=n[i];
                neglist+=n[i]+" ";
                negtv++;
            }

        }
        int avg=sum/len;
        System.out.print("the random n[] numbers are = ");
        for(int i=0;i<len;i++){
            System.out.print(n[i]+" ");
        }


        System.out.println("\naverage number of n[ ] ==> "+sum+"/"+len+" = "+avg);
        System.out.println("positive numbers are = "+poslist);
        System.out.println("negative numbers are = "+neglist);
        System.out.println("positive total numbers = "+postv);
        System.out.println("negative total numbers = "+negtv);



    }
}
