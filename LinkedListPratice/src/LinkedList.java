public class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }

    void create(int input){
        Node node = new Node(input);
        head = node;
        System.out.println(input+"added to list");
    }

    void insertBeginning(int input){
        if (head == null){
            create(input);
            return;
        }
        Node node = new Node(input);
        node.next = head;
        head = node;
        System.out.println(input+"added to list");
    }

    void insertEnd(int input){
        if (head == null){
            System.out.println("List is empty or underflow");
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        Node node = new Node(input);
        current.next = node;
        System.out.println(input+"added to list");
    }

    void insertBefore(int input , int value){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        boolean found = true;

        while (current.next.data != value){
            current = current.next;
            if (current == null){
                found = false;
            }
        }
        if (found){
            Node node = new Node(input);
            node.next = current.next;
            current.next = node;
            System.out.println(input+"added to list before" + value);
        }
        else {
            System.out.println("Not found");
        }
    }

    int removeBefore(int value) {
        if (head == null) {
            System.out.println("list is empty");
            return -404;
        }
        if (head.next == null) {
            System.out.println("list has only one item");
            return -404;
        }
        if (head.next.data == value) {
            Node node = head;
            head = head.next;
            return node.data;
        }
        Node current = head;
        boolean found = true;

        while (current.next.next.data != value) {
            current = current.next;
            if (current == null) {
                found = false;
                break;
            }
        }
        if (found) {
            Node node = current.next;
            current.next = node.next;
            node.next = null;
            return node.data;
        } else {
            System.out.println("Not found");
            return -404;
        }
    }
    int removeAfter(int value){
        if (head == null){
            System.out.println("List is empty or underflow");
            return -404;
        }
        if (head.next == null){
            System.out.println("list has only one item");
            return -404;
        }
        Node current = head;
        boolean found = true;

        while(current.data != value){
            current = current.next;
            if (current==null){
                found = false;
                break;
            }
        }
        if (found){
            Node node = current.next;
            current.next = node.next;
            node.next = null;
            return node.data;
        }
        else {
            System.out.println("not found");
            return -404;
        }
    }

    int removeBeginning(){
        if (head == null){
            System.out.println("List is empty");
            return -404;
        }
        Node node = head;
        head = head.next;
        return node.data;
    }
    int removeEnd(){
        if (head == null){
            System.out.println("list is empty");
            return -404;
        }
        Node node;
        if (head.next ==null){
            node = head;
            head = null;
            return node.data;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        node = current.next;
        current.next = null;
        return node.data;
    }

    void traverse(){
        Node current = head;
        while (current!= null){
            System.out.println(current.data+"===");
            current = current.next;
        }
        System.out.println("null");
    }

}