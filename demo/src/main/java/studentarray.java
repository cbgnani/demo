class detailsstud{
    String name;
    int age;
    detailsstud(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+"  "+age);
    }
}
public class studentarray {
    public static void main(String[] args){
        detailsstud s1=new detailsstud("nani",18);
        detailsstud s2=new detailsstud("rahul",21);
        detailsstud s3=new detailsstud("rahul",21);
        detailsstud s4=new detailsstud("rahul",21);
        detailsstud s5=new detailsstud("rahul",21);
        detailsstud studs[]=new detailsstud[5];
        studs[0]=s1;
        studs[1]=s2;
        studs[2]=s3;
        studs[3]=s4;
        studs[4]=s5;
        for(int i=0;i<studs.length;i++){
            System.out.println(studs[i].name+" "+studs[i].age);
        }
        //s1.display();
        //s2.display();
    }
}
