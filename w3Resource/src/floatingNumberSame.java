import java.util.Scanner;

public class floatingNumberSame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        double a = scanner.nextDouble();
        System.out.println("Enter your second number");
        double b = scanner.nextDouble();

        a = Math.round(a *1000);
        a = a/1000;

        b = Math.round(b * 1000);
        b = b/1000;

        if (a == b){
            System.out.println("They are same");
        }else{
            System.out.println("Not equal");
        }
    }
}
