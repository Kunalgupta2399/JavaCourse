public class Stack {

    Node top;

    public Stack() {
      top = null;
    }

    //insert beginning
    public void push(int input) {
        Node node = new Node(input);

        //check if the list does not exist or empty
        if(top == null) {
            top = node;
            return;
        }

        //list at least contains one element
        //point the new node to the first node of the list
        //point the start pointer to the new node
        node.next = top;
        top = node;
        System.out.println(input + " added to the stack");
    }

    //delete beginning
    public int pop() {
        //check if the list is empty
        if(top == null) {
            System.out.println("stack is empty, underflow");
            return -404;
        }

        //for single node or multiple nodes
        Node node = top;
        top = top.next;
        node.next = null;
        return node.data;
    }

    //see the top element
    public int peek() {
        return top.data;
    }

    //traversal
    public void print() {
        Node current = top;

        System.out.println("========================");
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("========================");
    }

    public boolean isEmpty() {
        if(top == null) {
            return true;
        }
        return false;
    }
}
