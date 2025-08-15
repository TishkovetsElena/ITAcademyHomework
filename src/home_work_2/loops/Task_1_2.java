package home_work_2.loops;

//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.2.* Используя рекурсию
public class Task_1_2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        long sum = 1L;
        sum = multiply(number);

        int a = 1;
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" = " + sum);
    }

    public static long multiply(int number) {
        if (number == 1 || number == 0) {
            return number;
        } else {
            long result = 1L;
            result = number * multiply(number - 1);
            return result;
        }
    }
}
