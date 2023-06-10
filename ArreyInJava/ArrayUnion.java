package ArreyInJava;
import java.util.Scanner;
class ArrayInput {
    int size1, size2;
    int[] array1;
    int[] array2;

    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        size1 = sc.nextInt();
        System.out.println("Enter the array element of 1st array:");
        array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array");
        size2 = sc.nextInt();
        System.out.println("Enter the array element of 2st array:");
        array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();
    }

    void arrayCompare() {
        /*
        * This block of code print the unique array element 1st array.
        * */
        for (int i = 0; i < size1; i++) {
            boolean foundInArray2;
            foundInArray2 = false;
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    foundInArray2 = true;
                    break;
                }
            }
            if (!foundInArray2) {
                System.out.println(array1[i]);
            }
        }
        /*
        * This block of code print the unique array element 2nd array.
        * */
        for (int i = 0; i < size2; i++) {
            boolean foundInArray1 = false;
            for (int j = 0; j < size1; j++) {
                if (array2[i] == array1[j]) {
                    foundInArray1 = true;
                    break;
                }
            }
            if (!foundInArray1) {
                System.out.println(array2[i]);
            }
        }
        /*
        * This block of code print the common array element of both array.
        * */
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}

    public class ArrayUnion {
        public static void main(String[] args) {
            ArrayInput ai = new ArrayInput();
            ai.arrayInput();
            ai.arrayCompare();
        }
    }


