import java.util.Arrays;

public class Task2 {
    public static void main (String[] args) {
        //String[][] arr = new String[][]{ new String[]{"aj","f"}, new String[]{"d", "y"}}; //NumberFormatException - строки могут быть не числоподобными
        String[][] arr = new String[][]{ new String[]{"1","2"}, new String[]{"33", "5"}};
        //String[][] arr = null; //NullPointerException - если мы решим так сделать

        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) { // ArrayIndexOutOfBoundsException - размер массива может быть меньше 5
                int val = Integer.parseInt(arr[i][j]);
                sum += val; }
        }
        return sum; }
    }
