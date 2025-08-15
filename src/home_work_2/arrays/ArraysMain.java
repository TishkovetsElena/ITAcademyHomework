package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

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
public class ArraysMain {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();

        int[] container1 = ArraysUtils.arrayRandom(5, 100);

        System.out.println(ArraysIteration.printAllElements());

        System.out.println(ArraysIteration.printThroughOneElements());

        System.out.println(ArraysIteration.printElementsInReverseOrder());
    }
}
