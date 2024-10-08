package home_work_1;

import java.util.Scanner;

/*
4.4 Перевести байты в килобайты или наоборот
Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора
 */
public class Task_4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        System.out.println("Выберите единицу измерения байт (введите \"б\") либо килобайт (введите \"кб\")");
        String unit = in.next();

        if(unit.equals("б")){
            System.out.println("Введенное число в килобайтах: " + a / 1024);
        } else if(unit.equals("кб")){
            System.out.println("Введенное число в байтах: " + a * 1024);
        } else {
            System.out.println("Введены некорректные данные");
        }
        in.close();
    }
}
