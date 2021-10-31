public class DoublyLinkedList {

    Node head;

    DoublyLinkedList() {
        head = null; //empty list
    }

    void create(Student input) {
        Node node = new Node(input);

        head = node; //head points to the new node created
    }

    void insertBeginning(Student input) {

        if(head == null) {
            //empty list condition
            create(input);
            return;
        }

        Node node = new Node(input); //initialise the node
        //connect new node to its required location
        //change the pointer of previous node
        node.next = head;
        head.previous = node;
        head = node;
    }

    Student removeBeginning() {

        if(head == null) {
            System.out.println("List is empty, underflow!");
            return null;
        }
        //break the connections
        Node node;//Declare node so we can find pointer
        node = head;
        head = head.next;
        node.next = null;
        head.previous = null;

        return node.data;
    }

    void print() {
        Node current;
        current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("NULL");
    }

    void insertEnd(Student input) {

        if(head == null) {
            //empty list condition
            create(input);
            return;
        }

        Node node = new Node(input); //initialise the node
        //connect new node to its required location
        //change the pointer of previous node

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = node;
        node.previous = current;
    }

    Student removeEnd() {
        if(head == null) {
            System.out.println("List is empty, underflow!");
            return null;
        }

        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }

        Node node = current.next;
        current.next = null;
        node.previous = null;

        return node.data;
    }
}
