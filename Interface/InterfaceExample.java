package Interface;
interface Car{
    default void start(){
        System.out.println("Car start");
    }
}
interface Bus {
    default void Movement() {
        System.out.println("Bus Movement");
    }
}
class Vehicle implements Car,Bus {

    public void Stop(){
        System.out.println("Vehicle stop");
        }
    public void Movement(){
        System.out.println("Vehicle Movement");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.Movement();
        v.Stop();
        v.start();
        }
    }


