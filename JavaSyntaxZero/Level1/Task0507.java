package JavaSyntaxZero.Level1;

import java.util.Scanner;

public class Task0507 {
    public static int[] array;

    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);
        int arrayLenght = console.nextInt();
        array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = console.nextInt();
        }
        int arrayMax = array[0];
        for (int i = 1; i < arrayLenght; i++) {
            if (array[i] > arrayMax) {
                arrayMax = array[i];
            }
        }
        System.out.println(arrayMax);
    }

}
