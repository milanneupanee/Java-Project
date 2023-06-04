package Lab5ExceptionHandling;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        try {
            double profit = 0.08;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int[] fruits = new int[size];
            System.out.println("Enter the array elements i.e fruit price:");
            for (int i = 0; i < size; i++) {
                fruits[i] = sc.nextInt();
            }
            System.out.println("Cost price\tProfit Amount\tTotal Amount");
            for (int i = 0; i < size; i++) {
                System.out.println(fruits[i] + "\t\t\t" + fruits[i] * profit + "\t\t\t" + (fruits[i] + fruits[i] * profit));
            }
        }
        catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
