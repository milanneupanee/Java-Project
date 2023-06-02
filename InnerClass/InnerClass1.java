package InnerClass;

class Outer1{
    class Inner1{
        void display(){
            System.out.println("I am inner class.");
        }
    }
    void display(){
        Inner1 in=new Inner1();
        in.display();
    }

}
public class InnerClass1 {
    public static void main(String[] args) {
        Outer1 out=new Outer1();
        out.display();
    }
}
