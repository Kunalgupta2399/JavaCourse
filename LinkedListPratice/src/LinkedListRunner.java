import java.util.Scanner;

public class LinkedListRunner {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        int choice;
        do{
            menu();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    create();
                    break;
                case 2:
                    insertBeginning();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    insertEnd();
                    break;
                case 6:
                    removeEnd();
                    break;
                case 7:
                    insertAfter();
                    break;
                case 8:
                    insertBefore();
                case 9:
                    removeAfter();
                    break;
                case 10:
                    removeBefore();
                    break;
            }
        }
        while(choice != 11);

            System.out.println("Quitting");

    }

    private static void insertEnd() {

    }

    private static void create() {
    }
    private static void insertBeginning() {
    }

    private static void remove() {
    }

    private static void traverse() {
    }
    private static void removeEnd() {
    }
    private static void removeAfter() {
    }
    private static void removeBefore() {
    }
    private static void insertBefore() {
    }
    private static void insertAfter() {
    }



    private static void menu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
