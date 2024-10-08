package home_work_1;
/*
4.2 Среди трёх чисел найти среднее
Вводятся три разных числа. Найти, какое их них является средним (больше одного, но меньше другого)
 */

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Необходимо ввести три числа.\nВведите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        System.out.println("Введите третье число:");
        int c = in.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        if(a != min && a != max){
            System.out.println("Среднее среди трех чисел: " + a);
        } else if(b!= min && b != max){
            System.out.println("Среднее среди трех чисел: " + b);
        } else if(c!= min && c != max){
            System.out.println("Среднее среди трех чисел: " + c);
        }
        in.close();
    }
}
