package ExceptionHandling;
import java.util.Scanner;
public class TryWithResource {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1= sc.nextInt();
            System.out.println("Enter second number:");
            int num2=sc.nextInt();
            System.out.println("The sum is:"+(num2+num1));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
