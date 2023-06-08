import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    IOFloatData();
    }

    public static void IOFloatData (){
        Scanner ck = new Scanner(System.in);
        System.out.print("Введите дробное число n = ");
        String n = ck.nextLine();
        while (isChek(n)){
            System.out.println("Ошибка, некорректный ввод, повторите заново!");
            n = ck.nextLine();
        }

        System.out.println("Введенное число n = " +  Float.parseFloat(n));
        ck.close();
    }

    public static boolean isChek (String number){
        try {
            Float.parseFloat(number);
            return false;
        } catch(NumberFormatException e){
            return true;
        }
    }
}
