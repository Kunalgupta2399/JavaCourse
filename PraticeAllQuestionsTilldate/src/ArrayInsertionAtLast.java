import java.util.Scanner;

public class ArrayInsertionAtLast {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};

        printArray(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element you want to insert at last ");
        int element = scanner.nextInt();

        array = insertLast(array , element);
        printArray(array);
    }

    private static int[] insertLast(int[] array, int element) { // O(n)
        int [] newArray = new int[array.length+1]; // O(1) - constant time

        for (int i = 0; i < array.length;  i++) { // O(n)
            newArray[i] =array[i]; // O(1)
        }
        newArray[array.length] = element; // O(1)
        return newArray; // O(1)
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+array[i]);
        }
    }
}
