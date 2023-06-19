package ArreyInJava;
import java.util.Scanner;
class ArraysInput {
    int size1;
    int[] array1;
    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        size1 = sc.nextInt();
        System.out.println("Enter the array element of 1st array:");
        array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        //sc.close();
    }
    public void arrayInsertion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index where you want to add the element in array");
        int index=sc.nextInt();
        if(index>size1&&index<0){
            System.out.println("Enter valid index..");
        }
        else {
            System.out.println("Enter the data:");
            int data=sc.nextInt();
            size1 += 1;
            int[] newArray = new int[size1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array1[i];
            }
            newArray[index] = data;
            for (int i = index + 1; i < size1; i++) {
                newArray[i] = array1[i - 1];
            }
            array1 = newArray;
            System.out.println("Data inserted successfully.");
        }
    }
}
public class ArrayInsertion {
    public static void main(String[] args) {
        ArraysInput input = new ArraysInput();
        input.arrayInput();
        input.arrayInsertion();
        System.out.println("Array after insertion: ");
        for (int i = 0; i < input.size1; i++) {
            System.out.print(input.array1[i] + " ");
        }
    }
}


