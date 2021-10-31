import java.util.Scanner;

public class LinkedListRunner {

    private static LinkedList list = new LinkedList();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        do {
            menu();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    create();
                    break;
                case 2:
                    insertEnd();
                    break;
                case 3:
                    removeBeginning();
                    break;
                case 4:
                    removeEnd();
                    break;
                case 5:
                    insertBeginning();
                    break;
                case 6 :
                    traverse();
            }
        }while (choice != 7);

        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        list.removeNNodes(n);
        list.traverse();
        System.out.println("Quitting");
    }

    private static void create() {
        System.out.println("Enter your data");
        scanner.nextLine();
        String input = scanner.nextLine();
        list.create(input);
    }

    private static void insertEnd() {
        System.out.println("Enter your value");
        scanner.nextLine();
        String input = scanner.nextLine();
        list.insertEnd(input);
    }

    private static void removeBeginning() {
        list.deleteBeginning();
    }

    private static void removeEnd() {

        list.deleteEnd();
    }

    private static void insertBeginning() {
        System.out.println("Enter your value");
        scanner.nextLine();
        String input = scanner.nextLine();
        list.insertBeginning(input);
    }

    private static void traverse() {
        list.traverse();
    }

    private static void menu() {
        System.out.println("1.Create");
        System.out.println("2.Insert End");
        System.out.println("3.Remove Beginning");
        System.out.println("4.Remove End");
        System.out.println("5.Insert Beginning");
        System.out.println("6.Traverse");

    }
}
