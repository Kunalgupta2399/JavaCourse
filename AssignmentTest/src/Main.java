public class Main {

    public static void main(String[] args) {
        Array array = new Array(5);

        int [] input = {1, 2, 3, 4, 5};

        array.insertData(input);
        array.insertAtIndex(10, 2);
        array.printArray();
        array.removeAtIndex(4);
        array.printArray();
        System.out.println(array.get(2));
        array.removeElement(10);
        array.printArray();
    }
}
