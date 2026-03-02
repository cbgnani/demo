class vehilist{
    void start(){
        System.out.println("vehicl start");

    }
    void stop(){
        System.out.println("vehicle stop");

    }
}
class car extends vehilist{
    void start(){
        System.out.println("car start");
    }
    /*void stop(){
        System.out.println("car stop");
    }*/

}
class bike extends vehilist{
    void start(){
        System.out.println("bike start");
    }
    /*void stop(){
        System.out.println("bike stop");
    }*/
}
class truck extends vehilist{
    void start(){
        System.out.println("truck start");
    }
   /* void stop(){
        System.out.println("truck stop");
    }*/
}

public class vehicle {
    public static void main(String[] args){
        vehilist car=new car();
        vehilist bike=new bike();
        vehilist truck=new truck();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
        truck.start();
        truck.stop();
    }
}
