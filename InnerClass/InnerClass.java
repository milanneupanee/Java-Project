package InnerClass;

class Outer{
    class Inner {
        void  display(){
            System.out.println("I am inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer out=new Outer();//Make the object of the outer class and with the help of it call inner class.
        Outer.Inner in=out.new Inner();
        in.display();
    }
}
