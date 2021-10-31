import java.util.Random;
import java.util.Scanner;

public class LinkedListRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList list = new LinkedList();
    public static void main(String[] args) {

        int choice;
        do {
            menu();

            System.out.println("enter choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    insert();
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
        } while( choice != 11);

        System.out.println("quitting!");
    }

    private static void removeAfter() {
        System.out.println("enter value : ");
        int value = scanner.nextInt();

        int data = list.removeAfter(value);
        System.out.println(data + " removed from the list");
    }

    private static void removeBefore() {
        System.out.println("enter value : ");
        int value = scanner.nextInt();

        int data = list.removeBefore(value);
        System.out.println(data + " removed from the list");
    }

    private static void insertBefore() {
        System.out.println("enter data : ");
        int input = scanner.nextInt();

        System.out.println("enter value : ");
        int value = scanner.nextInt();

        list.insertBefore(input, value);
    }

    private static void insertAfter() {
        System.out.println("enter data : ");
        int input = scanner.nextInt();

        System.out.println("enter value : ");
        int value = scanner.nextInt();

        list.insertAfter(input, value);
    }

    private static void removeEnd() {
        int data = list.removeEnd();

        System.out.println(data + " removed from the list");
    }

    private static void insertEnd() {
        System.out.println("enter data : ");
        int input = scanner.nextInt();

        list.insertEnd(input);
    }

    private static void create() {
        System.out.println("enter data : ");
        int input = scanner.nextInt();

        list.create(input);
    }

    private static void remove() {
        int data = list.removeBeginning();

        System.out.println(data + " removed from the list");
    }

    private static void traverse() {
        list.traverse();
    }

    private static void insert() {
        System.out.println("enter data : ");
        int input = scanner.nextInt();

        list.insertBeginning(input);
    }

    private static void menu() {

        System.out.println("1.create");
        System.out.println("2.insert");
        System.out.println("3.remove");
        System.out.println("4.print list");
        System.out.println("5.insert in the end");
        System.out.println("6.remove from end");
        System.out.println("7.insert after");
        System.out.println("8.insert before");
        System.out.println("9.remove after");
        System.out.println("10.remove before");
        System.out.println("11.quit");
    }
}
