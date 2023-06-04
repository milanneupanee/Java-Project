package Lab5ExceptionHandling;
import java.util.Scanner;
public class Deusi {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total money collected in Deusi:");
            int total_money = sc.nextInt();
            System.out.println("Enter total member involved in Deusi:");
            int total_player = sc.nextInt();
            int individual_money = total_money / total_player;
            if (total_money == individual_money * total_player) {
                System.out.println("Money is distributed equally and each of them will get:Rs" + individual_money);
            } else {
                System.out.println("Money can't be distributed equally.");
                System.out.println("Rs" + (total_money - individual_money * total_player) + " is indivisible amount and each player will get:Rs" + individual_money);
            }
        }
        catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }

}
