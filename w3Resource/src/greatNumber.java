import java.util.Scanner;

public class greatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter your 2nd number");
        int b = scanner.nextInt();
        System.out.println("Enter your 3rd number");
        int c = scanner.nextInt();

        if (a > b && a> c){
            System.out.println(a +" " + "is greater among all");
        }else if (b > a && b > c){
            System.out.println(b +" "+"is greater among all");
        }else {
            System.out.println(c +" "+ "is greater among all ");
        }
    }
}
