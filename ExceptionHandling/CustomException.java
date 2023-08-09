package ExceptionHandling;
/*
* WAP to check the eligibility for Nepalese Citizenship.
* Here eligible sge is 16 years
* We also use custom exception method for this exception.
* */
import java.util.Scanner;

public class CustomException extends ArithmeticException{
    CustomException(String str){
        super((str));
    }
    static void validateAge (int ag) {
        if (ag<16){
           throw new CustomException("First Parameter does not meet. Wait till age 16");
                    }
        else {
            System.out.println("Eligible for citizenship.");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter age");
            int age= sc.nextInt();

            validateAge(age);
        }
        catch (CustomException e){
            System.out.println("Not eligible for Citizenship.  "+e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
