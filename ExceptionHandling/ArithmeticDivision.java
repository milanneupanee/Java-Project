package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArithmeticDivision {
    int divideOperation(int x,int y){
        return x/y;
    }
    void Division(){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1st number:");
            int a= sc.nextInt();
            System.out.println("Enter second number:");
            int b= sc.nextInt();
            int result =divideOperation(a,b);
            System.out.println("The result is:"+result);
        }
        catch (ArithmeticException e){
            System.out.println("Input except 0"+e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Input type is invalid");
            e.printStackTrace();
        }
    }
}
