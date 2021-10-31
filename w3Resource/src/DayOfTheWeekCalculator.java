import java.util.Scanner;

public class DayOfTheWeekCalculator {

    public static void main(String[] args) {

        int day, month, year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date : ");
        System.out.println("Enter day : ");
        day = scanner.nextInt();
        System.out.println("Enter month : ");
        month = scanner.nextInt();
        System.out.println("Enter year : ");
        year = scanner.nextInt();

        String weekday = dayOfWeek(day, month, year);

        System.out.println("it is " + weekday);
    }

    private static String dayOfWeek(int day, int month, int year) {
        //1/1/1 = monday
        //23/12/1999 = thursday
        //year gap = 1998 * 365
        //month gap = 11 * 30
        //day gap = 22
        //day difference = 2363 + 330 + 22




        return null;
    }
}
