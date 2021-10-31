public class DoublyLinkedList {

    Node head;

    DoublyLinkedList(){
        head = null;
    }

    void create(int input){
        Node node = new Node(input);

        head = node;
    }

    void insertBeginning(int input){
        Node node = new Node(input);
        if (head == null){
            create(input);
            return;
        }
        node.next = head;
        node.previous = node;
        head = node;
    }

    Object removeBeginning(){
        if (head == null){
            System.out.println("list is empty or underflow");
            return null;
        }
        Node node;
        node = head ;
        head = head.next;
        node.next = null;
        node.previous = null;

        return node.data;
    }
    void print(){
        Node current;
        current = head;

        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Null");
    }

    void insertEnd(int input){
        if (head == null){
            create(input);
            return;
        }
        Node node = new Node(input);

        Node current = head;

        while(current != null){
            current = current.next;
        }
        current.next = node;
        node.previous = current;
    }
    Object removeEnd(){
        if (head == null){
            System.out.println("list is empty or underflow");
            return null;
        }
        Node current = head;
        while(current != null){
            current = current.next;
        }
        Node node = current.next;
        current.previous= null;
        current.next = null;

        return node.data;
    }

}
