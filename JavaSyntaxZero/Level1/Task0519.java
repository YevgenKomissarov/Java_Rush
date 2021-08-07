package JavaSyntaxZero.Level1;

import java.util.Arrays;

public class Task0519 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] arraySort = array.clone();
        Arrays.sort(arraySort);
        boolean flag = Arrays.binarySearch(arraySort, element) >= 0 ? true : false;
        System.out.println(flag);
        }
    }

    /*task
Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.

Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays. Первым параметром нужно передать отсортированный массив, в котором выполнить поиск, вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.

Для сортировки массива можно использовать метод Arrays.sort(int[]).
При тестировании значения переменных класса Solution будут разными.
Требования:

    •
    В методе main(String[]) не изменяй расположение элементов массива array.
    •
    При вызове метода main(String[]) вывести в консоли true, если значение переменной element содержится в массиве.
    •
    При вызове метода main(String[]) вывести в консоли false, если переданный элемент не содержится в массиве.
    •
    В методе main(String[]) используй вызов метода Arrays.binarySearch(int[], int).
     */