import java.util.Scanner;

public class ArrayRemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8};
        printArray(array);

        System.out.println("-==-=-=-=-=-");

//        array = removeFirst(array);
        array = removeLast(array);

        printArray(array);
    }

    private static int[] removeLast(int[] array) {
       int[] newArray = new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private static int[] removeFirst(int[] array) {
        int []newArray = new int[array.length-1];
        for (int i = 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"---"+ array[i]);
        }
    }
}
