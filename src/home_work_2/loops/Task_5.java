package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * 1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
 * 1.5.1. Найти наибольшую цифру натурального числа
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру. Например введено число 764580.
 * Наибольшая цифра в нем 8.
 * 1.5.2. Вероятность четных случайных чисел
 * Проверить корректность работы генератора псевдослучайных чисел языка программирования с помощью оценки
 * вероятности выпадения четных чисел на выборке не менее 1000 случайных чисел
 * 1.5.3. Посчитать четные и нечетные цифры числа
 * Посчитать четные и нечетные цифры введенного натурального числа. Например, если введено число 34560, то
 * у него 3 четные цифры (4, 6 и 0) и 2 нечетные (3 и 5)
 * 1.5.4. Ряд Фибоначчи
 * Вывести на экран столько элементов ряда Фибоначчи, сколько указал пользователь. Например, если на ввод
 * поступило число 6, то вывод должен содержать шесть первых чисел ряда Фибоначчи: 1235813
 * 1.5.5. Вывести ряд чисел в диапазоне с шагом
 * Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10,
 * максимум 35, шаг 5, то вывод должен быть таким: 10, 15, 20, 25, 30, 35. Минимум, максимум и шаг, указываются
 * пользователем (считываются с клавиатуры).
 * 1.5.6. Переворот числа
 * Сформировать из введенного числа обратное по порядку входящих в него цифр на экран. Например, если введено число
 * 3486, то надо вывести число 6843.
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = console.nextInt();
        if (number <= 0) {
            System.out.println("Введено некорректное число");
            return;
        }

        System.out.println("Максимальная цифра в введенном числе " + largestDigit(number));
        System.out.println("Вероятность выпадения четных чисел = " + evenProbability() + "%");

        System.out.println("Введите натуральное число:");
        int inputNumber = console.nextInt();
        System.out.println(countOfEvenAndOddDigit(inputNumber));

        System.out.println("Введите количество чисел ряда Фибоначчи для вывода:");
        int numberForFibonacci = console.nextInt();
        System.out.println(fibonacciSequence(numberForFibonacci));

        System.out.println("Введите минимальное число:");
        int minNumber = console.nextInt();
        System.out.println("Введите максимальное число:");
        int maxNumber = console.nextInt();
        System.out.println("Введите шаг:");
        int step = console.nextInt();
        System.out.println(sequenceOfNumberByStep(maxNumber, minNumber, step));

        System.out.println("Введите натуральное число:");
        int numberToFlip = console.nextInt();
        System.out.println(reverseNumber(numberToFlip));
    }

    /**
     * Метод определяет наибольшую цифру в переданном числе
     * @param number Пользователь вводит случайное число
     * @return наибольшую цифру
     */
    public static int largestDigit(int number) {
        String checkNumber = Integer.toString(number);
        int[] arr = new int[checkNumber.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(checkNumber.charAt(i));
        }

        int answer = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                answer = arr[i];
            }
        }
        return answer;
    }

    /**
     * Метод проверяет орректность работы генератора псевдослучайных чисел языка программирования с помощью оценки
     * вероятности выпадения четных чисел на выборке не менее 1000 случайных чисел
     * @return процент выпадения четных чисел
     */
    public static int evenProbability() {
        Random rnd = new Random();
        Integer random = 0;
        double evenCounter = 0;
        for (int i = 0; i <= 1000; i++) {
            random = rnd.nextInt(100);
            if (random % 2 == 0) {
                evenCounter++;
            }
        }
        double result = evenCounter / 1000 * 100;
        return (int) result;
    }

    /**
     * Метод считает количество четных и нечетных цифр в переданном числе
     * @param number пользователь передает число, в котором будет произведен подсчет
     * @return строку с результатом подсчета четных и нечетных чисел
     */
    public static String countOfEvenAndOddDigit(int number) {
        int oddCount = 0;
        int evenCount = 0;

        String checkNumber = Integer.toString(number);
        int[] arr = new int[checkNumber.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(checkNumber.charAt(i));
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return "Во введенном числе количество четных цифр = " + evenCount + ",\nколичество нечетных цифр = " + oddCount;
    }

    /**
     * Метод выводит ряд Фибоначчи
     * @param number пользователь вводит количество элементов ряда Фибоначчи для вывода
     * @return строку из чисел ряда Фибоначчи
     */
    public static String fibonacciSequence(int number) {
        int[] arr = new int[number];
        StringBuilder result = new StringBuilder();

        for (int i = 2; i < arr.length; i++) {
            arr[0] = 1;
            arr[1] = 2;
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]).append(" ");
        }
        return result.toString();
    }

    /**
     * Метод выводит цифры от min до max с заданным шагом
     * @param max пользователь вводит максимальное число
     * @param min пользователь вводит минимальное число
     * @param step пользователь вводит шаг
     * @return строку из чисел от min к max с заданным шагом
     */
    public static String sequenceOfNumberByStep(int max, int min, int step) {
        int[] arr = new int[(max - min) / step + 1];
        int sum = min;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum;
            sum += step;
        }

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]).append(" ");
        }
        return result.toString();
    }

    /**
     * Метод переворачивает переданное от пользователя число
     * @param number число, введенное пользователем
     * @return перевернутое число пользователя
     */
    public static String reverseNumber(int number) {
        StringBuilder result = new StringBuilder();
        String checkNumber = Integer.toString(number);
        int[] arr = new int[checkNumber.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(checkNumber.charAt(i));
        }
        int[] arrReserve = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReserve[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arrReserve.length; i++) {
            result.append(arrReserve[i]).append(" ");
        }

        return result.toString();
    }
}
