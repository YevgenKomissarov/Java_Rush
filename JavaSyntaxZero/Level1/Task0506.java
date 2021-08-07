package JavaSyntaxZero.Level1;

import java.util.Scanner;

public class Task0506 {
    public static int[] array;
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int arrayLenght = console.nextInt();
        array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = console.nextInt();
        }
        int arrayMin = array[0];
        for (int i=1; i<arrayLenght; i++) {
            if (array[i]<array[0]) {
                arrayMin = array[i];
            }
        }
        System.out.println(arrayMin);
    }

}
