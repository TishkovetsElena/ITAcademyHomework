package home_work_1;
/**
 * 1. Побитовые операции:
 * 	Материал: http://developer.alexanderklimov.ru/android/java/bitwise.php
 * 	1.1 Создать класс и написать код с вводом двух чисел через консоль и применением побитовых операций
 * 	И и ИЛИ к этим двум числам. Результат операций распечатать.
 * 	1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит),
 * 	также написать комметарии напротив каждой операции на примере этих двух чисел.
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");    //25 -> 0001 1001
        int a = in.nextInt();
        System.out.println("Введите второе число");    //12 -> 0000 1100
        int b = in.nextInt();

        int c = a & b;                                       // 0000 1000           (8)

        int d = a | b;                                       // 0001 1101           (29)

        System.out.printf("a & b = %d, a | b = %d\n", c, d);
        in.close();
    }
}
