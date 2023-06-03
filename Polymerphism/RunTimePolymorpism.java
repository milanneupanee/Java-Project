package Polymerphism;

class Animal{
    void makeSound(){
        System.out.println("All animal make sound.");
    }
}
class  Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
    void canWalk(){
        System.out.println("Bistarai.");
    }
}
public class RunTimePolymorpism {
    public static void main(String[] args) {
        /*
         * Using upcasting concept
         *
         */
        Animal animal=new Cat();
        animal.makeSound();
        /*
        * using down casting concept
        *
        * */
        Cat c=(Cat) animal;
        c.canWalk();
    }
}
