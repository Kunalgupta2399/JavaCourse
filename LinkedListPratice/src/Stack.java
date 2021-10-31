public class Stack {
    Node top;

    public Stack(){
        top = null;
    }

    public void push(int input){
        Node node = new Node(input);
        if (top == null){
            top = node;
            return;
        }

        node.next = top;
        top = node;
        System.out.println(input +"added to stack");

    }

    public int pop(){
        if (top == null){
            System.out.println("List is empty");
        }

        Node node = top;
        top = top.next;
        node.next = null;
        return node.data;
    }

    public int peek(){
        return top.data;
    }

    public void traverse(){
        Node current = top;
        while (current != null){
            System.out.println(current.data +"====");
            current = current.next;
        }
        System.out.println("++++++++++");
    }

    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        else{
            return false;
        }
    }

}
