package Polymerphism;

class  Shape{
    void draw(){
        System.out.println("You can draw different shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Radius is required.");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Length and Breadth is required.");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Only length is required.");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Shape shape;
        shape=new Circle();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
        shape = new Square();
        shape.draw();
    }
}

