package Polymerphism;

class ArithOperation{
    void add(){
        int a =10;
        int b=20;
        int sum=a+b;
        System.out.println("The sum is"+sum);
    }
    void add(int x,int y){
        int sum =x+y;
        System.out.printf("The sum is"+sum);
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        ArithOperation ao=new ArithOperation();
        ao.add();
        ao.add(34,56);
        int sum=ao.add(12,34,45);
        System.out.println("The sum is"+sum);
    }
}
