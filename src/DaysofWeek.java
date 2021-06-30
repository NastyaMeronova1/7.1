import java.util.Scanner;

public class DaysofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        int day = scanner.nextInt();
        if (day == 6){
            System.out.println("Сегодня выходной");
        }
        if (day == 7){
            System.out.println("Сегодня выходной");
        }
        if (day == 1){
            System.out.println("Сегодня рабочий день");
        }
        if (day == 2){
            System.out.println("Сегодня рабочий день");
        }
        if (day == 3){
            System.out.println("Сегодня рабочий день");
        }
        if (day == 4){
            System.out.println("Сегодня рабочий день");
        }
        if (day == 5){
            System.out.println("Сегодня пятница, пора на вечеринку");
        }
        if (day > 7){
            System.out.println("Некорректный номер недели");
        }
    }
}
