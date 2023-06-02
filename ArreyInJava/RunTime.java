package ArreyInJava;
import java.util.Scanner;
public class RunTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of the input");
        int size=sc.nextInt();
        int []pts=new int[size];
        System.out.println("Enter the element in the array");
        for (int i=0;i<size;i++){
            pts[i]= sc.nextByte();
        }
        System.out.println("Elements in array are:");
        for (int i=0;i<size;i++){
            System.out.println(+pts[i]);
        }
    }
}
