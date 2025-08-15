package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

/**
 * 2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 * 2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
 * запрашивает у пользователя через консоль.
 * 2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole().
 * Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3)
 * и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32}
 * и сохранён в переменную container.
 * 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает
 * два аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion)
 * указывает до какого числа генерировать рандомные числа.
 * 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom
 * будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrayLength = console.nextInt();
        System.out.println("Введите элементы массива:");
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        return array;
    }
    public  static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}
