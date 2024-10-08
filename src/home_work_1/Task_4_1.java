package home_work_1;

import java.util.Scanner;

/*
4.1 Определить нечётное число
Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число
 */
public class Task_4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: четное и нечетное.\nВведите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        if(a % 2 == 1  &&  b % 2 != 1){
            System.out.println(a);
        } else if(b % 2 == 1  &&  a % 2 != 1 ) {
            System.out.println(b);
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
        in.close();
    }
}
