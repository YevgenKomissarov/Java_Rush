package JavaSyntaxZero.Level1;

public class Task0504 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 25};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 26};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = i<firstArray.length ? firstArray[i] : secondArray[i - firstArray.length];
            /*if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i - firstArray.length];
            }*/
        }
        //напишите тут ваш код
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}


