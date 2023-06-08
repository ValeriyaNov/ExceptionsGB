import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            IOData();
        }

        public static void IOData (){
            Scanner ck = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String n = ck.nextLine();
            while (!(n != null && !n.trim().isEmpty())){
                System.out.println("Ошибка, пустые строки вводить нельзя, повторите заново!");
                n = ck.nextLine();
            }

            System.out.println("Введенная строка " + n);
            ck.close();
        }

    }
