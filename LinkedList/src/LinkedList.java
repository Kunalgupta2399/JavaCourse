public class LinkedList {

    Node head;

    LinkedList() {
        head = null;
    }

    void create(int input) {
        Node node = new Node(input);
        head = node;
        System.out.println("list created with first data = " + input);
    }

    void insertBeginning(int input) {
        Node node = new Node(input);

        //check if the list does not exist or empty
        if(head == null) {
            create(input);
            return;
        }

        //list at least contains one element
        //point the new node to the first node of the list
        //point the start pointer to the new node
        node.next = head;
        head = node;
        System.out.println(input + " added to the list");
    }

    void insertEnd(int input) {
        Node node = new Node(input);

        //check if the list is empty
        if(head == null) {
            create(input);
            return;
        }

        //take a traversing node named as current
        //initialise it to start
        Node current = head;

        //traverse till you reach the last node
        //to get the last node we will check current.next is null
        while(current.next != null) {
            current = current.next;
        }

        //connect the new node to the next of current
        current.next = node;
        System.out.println(input + " added to the list");
    }


    void insertBefore(int input , int value){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        boolean found = true;

        while(current.next.data != value) {
            current = current.next;

            if(current == null) {
                found = false;
                break;
            }
        }

        if(found) {
            Node node = new Node(input);
            node.next = current.next;
            current.next = node;
            System.out.println(input + " added to the list after " + value);
            return;
        } else {
            System.out.println("value not in the list");
        }

    }


    void insertAfter(int input, int value) {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        Node current = head;
        boolean found = true;

        while(current.data != value) {
            current = current.next;

            if(current == null) {
                found = false;
                break;
            }
        }

        if(found) {
            Node node = new Node(input);
            node.next = current.next;
            current.next = node;
            System.out.println(input + " added to the list after " + value);
            return;
        } else {
            System.out.println("value not in the list");
        }

    }

    int removeBefore(int value) {
        //check if the list is empty
        if(head == null) {
            System.out.println("list is empty, underflow");
            return -404;
        }

        if(head.next == null) {
            System.out.println("only one element in the list");
            return -404;
        }

        if(head.next.data == value) {
            return removeBeginning();
        }

        Node current = head;
        boolean found = true;


        while(current.next.next.data != value) {
            current = current.next;

            if(current == null) {
                found = false;
                break;
            }
        }

        if(found) {
            Node node = current.next;
            current.next = node.next;
            node.next = null;
            return node.data;
        } else {
            System.out.println("value not in the list");
            return -404;
        }
    }


    int removeAfter(int value) {
        //check if the list is empty
        if(head == null) {
            System.out.println("list is empty, underflow");
            return -404;
        }

        if(head.next == null) {
            System.out.println("only one element in the list");
            return -404;
        }

        Node current = head;
        boolean found = true;

        while(current.data != value) {
            current = current.next;

            if(current == null) {
                found = false;
                break;
            }
        }

        if(found) {
            Node node = current.next;
            current.next = node.next;
            node.next = null;
            return node.data;
        } else {
            System.out.println("value not in the list");
            return -404;
        }

    }

    int removeBeginning() {
        //check if the list is empty
        if(head == null) {
            System.out.println("list is empty, underflow");
            return -404;
        }

        //for single node or multiple nodes
        Node node = head;
        head = head.next;
        return node.data;
    }

    int removeEnd() {
        //check if the list is empty
        if(head == null) {
            System.out.println("list is empty, underflow");
            return -404;
        }

        Node node;

        //if the list contains only one node
        if(head.next == null) {
            node = head;
            head = null;
            return node.data;
        }

        //if the list contains multiple nodes
        //initialise it to start
        Node current = head;

        //traverse till you reach the second last node
        //to get the second last node we will check current.next.next is null
        while(current.next.next != null) {
            current = current.next;
        }

        node = current.next;
        current.next = null;
        return node.data;
    }

    void traverse() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("NULL");
    }

}
