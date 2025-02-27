package home_work_2.loops;

//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//        1.1.1. Используя только цикл
public class Task_1_1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int a = 1;
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a++;
        }
        long sum = 1L;

        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
            if(sum < 0){
                System.out.println("Вы ввели слишком большое число. Произошло переполнение");
                return;
            }
        }

        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        if(number != 0){
            System.out.println(" = " + sum);
        }else {
            System.out.println(" = 0");
        }
    }
}
