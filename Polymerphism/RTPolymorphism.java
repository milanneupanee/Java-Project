package Polymerphism;

import java.util.Scanner;
class Area{
    void calculate(){
        System.out.println("You can calculate area of different shape");
    }
}
class CircleArea extends Area{
    void calculate(){
        int radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the radius of circle");
        radius=sc.nextInt();
        System.out.println("The area of circle is:"+3.14*radius*radius);
    }
}
class RectangleArea extends Area{
    void calculate(){
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length and breadth");
        length =sc.nextInt();
        breadth=sc.nextInt();
        System.out.println("Polymerphism.Area of rectangle is:"+length*breadth);
    }
    void random(){
        System.out.println("This much for today.........");
    }
}
public class RTPolymorphism {
    public static void main(String[] args) {
        Area a;
        a=new CircleArea();//upcasting
        a.calculate();
        a=new RectangleArea();
        a.calculate();
        RectangleArea f=(RectangleArea)  a;//down casting..
        f.random();
    }
}
