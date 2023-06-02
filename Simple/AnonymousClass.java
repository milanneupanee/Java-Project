import java.sql.SQLOutput;

abstract class Vehicle {
   /*
   *  abstract classes are those that cannot be instantiated
   *  and should be extended by other classes
   */
    abstract void display();
    abstract void start();
}

public abstract class AnonymousClass extends Vehicle{
    public static void main(String[] args) {
        AnonymousClass ac = new AnonymousClass() { //create an anonymous subclass of Vehicle
            void start() {
                System.out.println("With Key");
            }
           void display() {
                System.out.println("This is a vehicle");
            }
        };
        ac.display(); //call the implemented method
        ac.start();
    }
}