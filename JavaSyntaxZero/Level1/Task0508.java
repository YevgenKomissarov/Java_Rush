package JavaSyntaxZero.Level1;

import java.util.Scanner;

public class Task0508 {

    public static String[] strings;

    public static void main(String[] args) {
        //начало моего кода
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }


        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                String flagValue = strings[i];
                for (int j = 0; j < strings.length; j++) {
                    if (j == i) {
                        continue;
                    } else {
                        if (strings[i].equals(strings[j])) {
                            strings[j] = null;
                            flagValue = null;

                        }
                    }
                }
                strings[i] = flagValue;
            } else {
                i++;
            }
        }

        //окончание моего кода
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
