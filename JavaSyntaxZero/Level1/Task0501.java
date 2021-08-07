package JavaSyntaxZero.Level1;

public class Task0501 {
    public static void main(String[] args) {

        String[] arrayString = new String[10];
        for (int i = 0; i < arrayString.length; i++) {
            if (i % 2 == 0) {
                arrayString[i] = "Чётный";}
            else arrayString[i] = "Нечётный";
            System.out.println(i + " = " + arrayString[i]);
        }
    }
}
