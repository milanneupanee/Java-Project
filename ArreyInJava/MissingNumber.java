package ArreyInJava;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter element:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int max = size;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] register = new int[max+1];
        for (int i : array) {
            register[i] = 1;
            //it makes the array of max number and allow 1 to the array element index.
            //eg if 1,4 is input array then register=1,0,0,1
        }
        System.out.println("missing numbers in given array");
        for (int i=1;i<=max; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
