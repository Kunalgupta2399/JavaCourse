import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int input = scanner.nextInt();
        if (input < 0){
            System.out.println("Its negative  number");
        }else{
            System.out.println("Its positive number");
        }

    }
}
