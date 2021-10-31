import java.util.Scanner;

public class ArraySelectionSort {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your array size");
        int n = scanner.nextInt();
        int []array = inputArray(n);
        selectionSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+array[i]);
        }
    }

    private static int[] inputArray(int n) {
        int[] array =new int[n];
        System.out.println("Enter your array");
        for (int i = 0; i < array.length; i++) {
           array [i] = scanner.nextInt();
        }
        return array;
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
