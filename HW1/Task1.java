import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = "StringIndexOutException";
        int index = 25;
        System.out.println(getLetter(str, index));
        inputDate();
        ArrayList<Integer> lst = null;

        System.out.println(deleteNum(lst, 0).toString()); //NullPoinerExeption
    }

    public static String getLetter(String string, int n) {
        char letter = string.charAt(n);
        return String.valueOf(letter);
    }

    public static void inputDate(){
        Scanner scan = new Scanner("");
        System.out.println("NoSuchElementException" + scan.nextLine());
    scan.close();
    }

    public static ArrayList deleteNum (ArrayList<Integer> lst, int n){

        System.out.println(lst.remove(n));
        System.out.println(lst.toString());
        return lst;
    }


}
