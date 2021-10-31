public class Queue {
    Node front;
    Node rear;

    public Queue(){
        front = null;
        rear = null;
    }

    public void enqueue(int input){
        Node node = new Node(input);
        if (front == null && rear == null){
            front = node ;
            rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public int dequeue(){
        if (front == null && rear == null){
            System.out.println("List is empty or underflow");
            return -404;
        }
        Node node;
        node = front;
        front.next = front;
        node.next = null;

        return node.data;
    }

}
