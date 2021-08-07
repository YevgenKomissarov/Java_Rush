package JavaSyntaxZero.Level1;

import java.util.Scanner;

public class Task0511 {
    public static int[][] multiArray;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int arrayOutLenght = 0;

        if (console.hasNextInt()) {
            arrayOutLenght = console.nextInt();
            if (arrayOutLenght <= 0) {
            }
        }

        int[] temporaryArray = new int[arrayOutLenght];
        for (int count = 0; count < temporaryArray.length; count++) {
            int dataFromConsole = console.nextInt();
            if (dataFromConsole > 0) {
                temporaryArray[count] = dataFromConsole;
            }
        }
        console.close();

        multiArray = new int[temporaryArray.length][];
        for (int count = 0; count < multiArray.length; count++) {
            multiArray[count] = new int[temporaryArray[count]];
        }
        for (int count = 0; count < multiArray.length; count++) {
            System.out.print(multiArray[count].length + " ");
        }
    }
}
