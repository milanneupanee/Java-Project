import java.util.Scanner;
class Input{
int sum(int a , int b){
    int c=a;
    int d=b;
    return c+d;
    }   

public static void main(String[] args){
    Input i=new Input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Input first number");
    int a =sc.nextInt();
    System.out.println("Input Second number");
    int b=sc.nextInt();
    int sum=i.sum(a,b);
    System.out.println("The sum is:"+sum);
    sc.close();
    
}
}
