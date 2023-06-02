package InnerClass;

//In local inner class we use the concept of local variable. Here we repalce local variable with
//class
class Outer2{
    int x =300;
    void LocalInner(){
        class Inner2 {
            void display() {
                System.out.println("value is:"+x);
            }
        }
        //Inner class is call immediate after the end of class inside the outer class.
        Inner2 in=new Inner2();
        in.display();
    }
}
public class LocalInner {
    public static void main(String[] args) {
        Outer2 out=new Outer2();
        out.LocalInner();
    }

}
