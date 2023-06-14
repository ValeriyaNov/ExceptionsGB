import java.util.Scanner;

public class Input {
    public static String[] inputData(){
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("Введите ФИО через пробел (Например Петров Павел Иванович), дату рождения (например 12.01.2001), телефон (только цифры) и пол через пробел (f или m)");
        System.out.println("Все данные вводим через пробел");

        return scanner.nextLine().split(" ");
    }
}
