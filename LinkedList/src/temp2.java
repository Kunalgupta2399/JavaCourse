

public class temp2 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.create(8);
        l1.insertEnd(1);
        l1.insertEnd(3);
        l1.insertEnd(0);
        l1.insertEnd(6);
        l1.insertEnd(9);
        l1.insertEnd(2);
        l1.insertEnd(8);
        l1.insertEnd(4);
        l1.insertEnd(3);

        l1.traverse();

        removeValue(l1, 8);
        l1.traverse();


        change(l1, 4);

        l1.traverse();

        System.out.println(contains(l1 , 6));
        System.out.println(contains(l1 , 7));



    }

    public static void change(LinkedList list, int value) {
       Node current = list.head;
       while (current != null){
           if (current.data > value){
              current.data = current.data / 2;
           } else if (current.data < value) {
               current.data = current.data * 2;
           }
           current = current.next;
       }
    }

    public static boolean contains(LinkedList list, int value) {
        Node current = list.head;
        while (current !=null){
            if (value == current.data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void removeValue(LinkedList list, int value) {
        if (list.head == null){
            System.out.println("list is empty , underflow");
            return;
        }


        if (list.head.next == null){
            Node node = list.head;
            if (value == node.data){
                list.head = null;
                return;
            } else {
                System.out.println("value not present");
                return;
            }
        }

        Node current = list.head;
        boolean found = true;

        while(current.next.data != value){
            current = current.next;
            if (current == null){
                found = false;
                break;
            }
        }

        if (found){
            Node node = current.next;
            current.next = node.next;
            node.next = null;
        } else {
            System.out.println("not found");
        }


    }
}



