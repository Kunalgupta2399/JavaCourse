import java.util.Scanner;

public class Student {

    private String name;
    private int rollNumber;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details of the student : ");
        System.out.println("name :  ");
        this.name = scanner.nextLine();
        System.out.println("roll number : ");
        this.rollNumber = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
