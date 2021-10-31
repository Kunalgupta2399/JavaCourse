import java.util.Scanner;

public class ArrayInsertSpecificIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare the array
        int[] array = {1, 2, 3, 4, 5, 6};

        printArray(array);

        //get the element
        System.out.println("Enter new element : ");
        int element = scanner.nextInt();

        System.out.println("Enter index < array length : ");
        int index = scanner.nextInt();

        //call the insert last and update the array
        array = insertAtIndex(array, element, index);

        printArray(array);
    }

    private static int[] insertAtIndex(int[] array, int element, int index) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        newArray[index] = element;
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " -- " + array[i]);
        }
    }
}
