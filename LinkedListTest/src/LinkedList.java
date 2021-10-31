public class LinkedList {
    //make linkedList with String Data
    //insert Beginning , end
    //delete Beginning , end
    // traverse
    Node head;
    LinkedList(){
        head = null;
    }
    void create(String input){
        Node node = new Node(input);
        head = node;
        System.out.println(input+"added to list");
    }


    void insertBeginning(String input){
        if (head == null){
            create(input);
            return;
        }
        Node node = new Node(input);
        node.next = head ;
        head = node;
        System.out.println(input+"added to list");
    }

    void insertEnd(String input){
        Node node = new Node(input);
        if (head == null){
            create(input);
            return;
        }
        Node current = head;
        while(current.next!= null){
            current  = current.next;
        }
        current.next = node;
        System.out.println(input+"added to list");
    }

    String deleteBeginning(){
        if (head == null){
            System.out.println("List is empty or underflow");
            return null;
        }
        Node node = head;
        head = head.next;
        return node.data;
    }

    String deleteEnd(){
        if (head == null){
            System.out.println("List is empty or underflow");
            return null;
        }

        Node node;
        if (head.next == null) {
            node = head;
            head = null;
            return node.data;
        }

        Node current = head ;
        boolean found = true;
        while(current.next.next != null){
            current = current.next;
            if (current == null){
                found = false;
                break;
            }
        }
        if (found){

            node = current.next;
            current.next = null;
            return node.data;
        }else{
            System.out.println("List is empty");
            return null;
        }
    }
    void traverse(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+"---");
            current = current.next;
        }
        System.out.println();
    }

    void removeNNodes(int n) {
        for (int i = 0; i < n ; i++) {
            System.out.println(deleteBeginning() + " removed ");
        }
    }

}
