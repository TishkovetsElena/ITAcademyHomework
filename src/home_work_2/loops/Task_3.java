package home_work_2.loops;

import java.util.Scanner;

/**
 * 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число,
 * которое мы будем возводить. Второе число это степень, в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
 * Math использовать нельзя.
 * 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        System.out.println("Введите возводимое в степень число. Число может быть отрицательным, дробным");
        double base = console.nextDouble();
        System.out.println("Введите степень числа. Число может быть только целым и положительным");
        int exponent = console.nextInt();

        if (exponent < 0) {
            System.out.println("Введено некорректное число");
            return;
        }

        double sum = 1L;

        for (int i = 0; i < exponent; i++) {
            sum *= base;
        }
        System.out.println(base + " ^ " + exponent + " = " + sum);
    }
}
