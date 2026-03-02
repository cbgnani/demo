class employee {
    String name;
    int salary;
    public employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    double calculateBonus(){
        return 0;
    }
    void display(){
        System.out.println(name+" "+salary);
    }
}
class manager extends employee{
    manager(String name,int salary){
        super(name,salary);
    }
    @Override
    public double calculateBonus(){
        return salary*0.20;
    }
}
class developer extends employee {
    developer(String name,int salary){
        super(name,salary);

    }
    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }
}
public class EmployeeSal {
    public static void main(String[] args){
        employee e1=new manager("nani",30000);
        employee e2=new developer("rahul",30000);
        e1.display();
        System.out.println("discount : "+e1.calculateBonus());
        e2.display();
        System.out.println("discount : "+e2.calculateBonus());

}
}
