public class Node {
    Node previous;
    Student data;
    Node next;
    Node(Student input) {
        previous = null;
        data = input;
        next = null;
    }
}
