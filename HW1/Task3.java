import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        try {
            int[] lst1 = new int[]{2, 5, 6};
            int[] lst2 = new int[]{2, 9, 8, 9};
            System.out.println(Arrays.toString(devidedArray(lst1, lst2)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка, размер первого массива больше второго!");
        }

    }

    public static float[] devidedArray(int[] lst1, int[] lst2){
        float[] lst3 = new float[lst1.length];
        if (lst1.length<lst2.length){
            System.out.println("Размер первого массива меньше второго, поэтому элементы воторого массива, имеющие индекс, больший, чем последний индекс первого массива, не учтены");
        }
        for (int i = 0; i < lst1.length; i++){
            if (lst2[i] == 0) {
                System.out.println("Ошибка, деление на 0");
                lst3 = null;
                break;
            } else {
                lst3[i] = (float) lst1[i] / (float) lst2[i];
            }

        }
        return lst3;
    }
}
