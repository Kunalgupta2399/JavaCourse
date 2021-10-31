import java.util.Scanner;

public class ArrayInsertionAtFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = {1 ,2 ,3, 4,5 ,6 , 7};

        printArray(array);
        System.out.println("Enter the new element you want to insert");
        int element = scanner.nextInt();

        array = insertAtFirst(array , element);

        printArray(array);
    }

    private static int[] insertAtFirst(int[] array, int element) {
        int [] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i+1] =array[i];
        }
        newArray[0] =element;
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i +"----"+array[i]);
        }
    }
}
