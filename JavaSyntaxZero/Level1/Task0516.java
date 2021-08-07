package JavaSyntaxZero.Level1;

import java.util.Arrays;

public class Task0516 {
    public static int[] array = new int[7];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {

//        int marker = array.length / 2;
//        if (array.length % 2 == 0) {
//            Arrays.fill(array, 0, marker, valueStart);
//            Arrays.fill(array, marker, array.length, valueEnd);
//        } else {
//            Arrays.fill(array, 0, marker + 1, valueStart);
//            Arrays.fill(array, marker + 1, array.length, valueEnd);
//        }

        int marker = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, marker, valueStart);
        Arrays.fill(array, marker, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
