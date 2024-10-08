package home_work_1;
/*
4.3 Проверка делимости одного числа на другое
Вводятся два целых числа. Проверить делится ли первое на второе. Вывести на экран сообщение об этом,
а также остаток, если он есть, и частное в любом случае.
 */

import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа.\nВведите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        if(a % b == 0){
            System.out.println("Числа делятся без остатка");
            System.out.println(a +  " / " + b + " = " + a / b);
        } else {
            System.out.println("Первое число не делится на второе без остатка");
            System.out.println(a +  " / " + b + " = " + a / b + ", остаток " + a % b);
        }
        in.close();
    }
}
