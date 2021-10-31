public class Queue {

    Node front;
    Node rear;

    public Queue() {
      front = null;
      rear = null;
    }

    //insert
    public void enqueue(Student input) {
        Node node = new Node(input);

        //if list is empty
        if(front == null && rear == null) {
            front = node;
            rear = node;
            return;
        }

        node.previous = rear;
        rear.next = node;

        rear = node;
    }

    public Student dequeue() {
        if(front == null && rear == null) {
            System.out.println("List is empty, underflow!");
            return null;
        }
        //break the connections
        Node node;//Declare node so we can find pointer
        node = front;
        front = front.next;
        node.next = null;
        front.previous = null;

        return node.data;
    }

    public void print() {
        Node current;
        current = front;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("NULL");
    }
}
