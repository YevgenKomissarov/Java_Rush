package JavaSyntaxZero.Level1;

import java.util.Arrays;

public class Task0512 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
//        for (int[][] arrayVar : multiArray) {
//            for (int[] arrayVar2 : arrayVar) {
//                for (int arrayVar3 : arrayVar2) {
        String str = Arrays.deepToString(multiArray);
                    System.out.print(Arrays.deepToString(multiArray));

//                }
//            }
//        }
//        String[] array = {"Привет", "Как", "Дела"};
//        String str = Arrays.toString(array);
//        System.out.println(str);
    }
}
