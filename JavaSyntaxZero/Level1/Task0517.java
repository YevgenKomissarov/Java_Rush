package JavaSyntaxZero.Level1;

import java.util.Arrays;

public class Task0517 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        //напишите тут ваш код
        int marker = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, marker);
        result[1] = Arrays.copyOfRange(array, marker, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
