package home_work_2.loops;

import java.util.Objects;

/**
 * 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
 * ход вычислений в консоль. Пользователь обязан ввести целое число.
 * Если ввели не целое, то выдать сообщение о том что пользователь ввёл некорректные данные.
 * 1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 * 1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 * 1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */
public class Task_2 {
    public static void main(String[] args) {
        String number = args[0];
        StringBuilder answer = new StringBuilder();
        long sum = 1L;

        char[] arrChar = number.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == ',' || arrChar[i] == '.') {
                System.out.println("Введено не целое число");
                return;
            }
        }
        for (int i = 0; i < arrChar.length; i++) {
            if (!Character.isDigit(arrChar[i])) {
                System.out.println("Введено не число");
                return;
            }
        }

        int[] arr = new int[number.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(number.charAt(i));
        }

        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
            if (sum < 0) {
                System.out.println("Вы ввели слишком большое число. Произошло переполнение");
                return;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            answer.append(arr[i]).append(" * ");
        }
        answer.append(arr[arr.length - 1]).append(" = ").append(sum);
        System.out.println(answer);
    }
}
