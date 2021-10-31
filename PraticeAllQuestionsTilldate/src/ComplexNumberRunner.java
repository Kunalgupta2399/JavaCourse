public class ComplexNumberRunner {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();
        ComplexNumber answer = new ComplexNumber();

        System.out.println("Enter your complex Number 1");
        c1.set();
        System.out.println("Enter your complex Number 2");
        c2.set();


        System.out.println("Addition of them : ");
        answer = c1.add(c2);
        answer.print();

        System.out.println("Subtraction of them : ");
        answer = c1.subtract(c2);
        answer.print();

        System.out.println("Multiplication of them : ");
        answer = c1.multiply(c2);
        answer.print();
    }
}
