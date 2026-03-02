class oops1 {
    String name;//instance variables
    int age;//these instance variables belongs to each object.
    //static int secno=45;//static member(belogs to the class)we use the static member in inside the method.
    oops1(String name,int age){ //constructor method
        this.name=name;
        this.age=age;
    }
    void agetodrive() {
        //int roolno=23;//local variables (in this program we can't used it)
        System.out.println("your name is ("+name+") and the age is = "+age);
        if(age>18) {
            System.out.println("you can drive");
        }
        else{
            System.out.println("you cannot drive");
        }
    }
}
    public class oops {
        public static void main(String[] args) {
            oops1 student1 = new oops1("kiran",17);
            student1.agetodrive();
            oops1 student2 = new oops1("leela",29);
            student2.agetodrive();
            oops1 arr[]=new oops1[2];
            arr[0]=student1;
            arr[1]=student2;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i].name+" "+arr[i].age);
            }
        }
}
