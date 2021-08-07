package JavaSyntaxZero.Level1;

import java.util.Scanner;

public class Task0505 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        int arrayLenght = console.nextInt();
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = console.nextInt();
        }
        if (arrayLenght % 2 == 0) {
            for (int i = arrayLenght - 1; i >= 0; i--) {
                System.out.println(array[i]);

            }
        } else {
            for (int i = 0; i < arrayLenght; i++) {
                System.out.println(array[i]);

            }
        }
    }
}