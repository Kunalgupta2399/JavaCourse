import java.util.Scanner;

public class Runner {
    private static Scanner scanner = new Scanner(System.in);
    private static DoublyLinkedList list = new DoublyLinkedList();

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
            }
        } while (choice != 7);

        System.out.println("quitting!");
    }

    private static void removeEnd() {
        Student data = list.removeEnd();

        System.out.println(data + " removed from the list");
    }

    private static void insertEnd() {
        System.out.println("enter data : ");
        Student input = new Student();

        list.insertEnd(input);
    }

    private static void create() {
        System.out.println("enter data : ");
        Student input = new Student();

        list.create(input);
    }

    private static void remove() {
        Student data = list.removeBeginning();

        System.out.println(data + " removed from the list");
    }

    private static void traverse() {
        list.print();
    }

    private static void insert() {
        System.out.println("enter data : ");
        Student input = new Student();

        list.insertBeginning(input);
    }

    private static void menu() {

        System.out.println("1.create");
        System.out.println("2.insert");
        System.out.println("3.remove");
        System.out.println("4.print list");
        System.out.println("5.insert in the end");
        System.out.println("6.remove from end");
        System.out.println("7.quit");
    }
}
