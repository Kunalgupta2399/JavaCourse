import java.util.Scanner;

public class ArrayRemoveBeforeAndAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4};
        printArray(array);

        System.out.println("Enter the element you want to remove");
        int element = scanner.nextInt();

        array = removeBefore(array , element);

        printArray(array);
    }

    private static int[] removeBefore(int[] array, int element) {
        int [] newArray = new int[array.length-1];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            newArray[i] =array[i];
        }
        for (int i = index; i < array.length ; i++) {
            newArray[i-1] = array[i];
        }
        newArray[index] =element;
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+array[i]);
        }
    }
}
