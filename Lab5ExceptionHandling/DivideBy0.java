package Lab5ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DivideBy0 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            System.out.println("The division is:" + (num1 / num2));
        }

        catch(ArithmeticException e) {
            System.out.println("Error"+e.getMessage());
                }
        catch(InputMismatchException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}

