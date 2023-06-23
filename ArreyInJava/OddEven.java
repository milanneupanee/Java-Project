package ArreyInJava;
import java.util.Scanner;
class InputArray {
    int size;
    int[] array;
    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = sc.nextInt();
        System.out.println("Enter the element of array:");
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    }
    void calculation() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] EvenArray = new int[count];
        int[] OddArray = new int[size - count];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                EvenArray[evenIndex] = array[i];
                evenIndex++;
            } else {
                OddArray[oddIndex] = array[i];
                oddIndex++;
            }
        }
        System.out.println("Even Elements are:");
        for (int i = 0; i < count; i++) {
            System.out.print(EvenArray[i] + " ");
        }
        System.out.println("\nOdd Elements are:");
        for (int i = 0; i < size - count; i++) {
            System.out.print(OddArray[i] + " ");
        }
    }
}
public class OddEven {
    public static void main(String[] args) {
        InputArray ia =new InputArray();
        ia.arrayInput();
        ia.calculation();
    }
}