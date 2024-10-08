package home_work_1;
/*
3. Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html).
Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        System.out.println(Math.multiplyExact(a, b));
        System.out.println(Math.floor(a/b));
        System.out.println(Math.abs(a - b));
        in.close();
    }
}

