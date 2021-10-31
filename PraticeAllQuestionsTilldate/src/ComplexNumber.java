import java.util.Scanner;

public class ComplexNumber {
private int real;
private  int imaginary;


public ComplexNumber add(ComplexNumber complexNumber){
    ComplexNumber answer = new ComplexNumber();
    answer.real = this.real + complexNumber.real;
    answer.imaginary = this.imaginary + complexNumber.imaginary;
    return answer;
}

public ComplexNumber subtract(ComplexNumber complexNumber){
    ComplexNumber answer = new ComplexNumber();
    answer.real = this.real -complexNumber.real;
    answer.imaginary = this.imaginary - complexNumber.imaginary;
    return answer;
}

public ComplexNumber multiply(ComplexNumber complexNumber){
    ComplexNumber answer = new ComplexNumber();

    answer.real = (this.real * complexNumber.real) - (this.imaginary* complexNumber.imaginary);
    answer.imaginary = (this.real *complexNumber.imaginary) + (this.imaginary * complexNumber.real);
    return answer;
}
public void print(){
    System.out.println("Your Complex number is ("+ this.real + ") + (" + this.imaginary + ")i ");
}
public void set(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your real number");
    real= scanner.nextInt();
    System.out.println("Enter your Imaginary part");
    imaginary = scanner.nextInt();

    this.print();
}
}
