class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void defStudent(){
        System.out.println(name);
    }
}
class Anclass extends Student{
    int roomno;
    int age;
    Anclass(String name,int roomno,int age) {
        super(name);//we can call only one parent class constructor to set the atribute.
        //it con't support multiple parent class constructor class values.
        this.roomno = roomno;
        this.age=age;
    }
        void defStudent(){ //in this case we override the method from parent class
            super.defStudent();
            System.out.println("my room no "+roomno+" and my age is "+age);
        }
}
public class uthiskey {
    public static void main(String[] args){
        Anclass stud=new Anclass("nani",12,18);
        Anclass stud2=new Anclass("rahul",34,21);
        stud.defStudent();
        stud2.defStudent();
    }
}
