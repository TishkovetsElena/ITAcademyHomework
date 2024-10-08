package home_work_1;
/*
4.6 Определить високосный год или нет
Определить, является ли год, который ввел пользователь, вискосным или невисокосным
 */

import java.util.Scanner;

public class Task_4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();

        if(year % 4 != 0  ||  year % 100 == 0  &&  year % 400 != 0){
            System.out.println("Введенный год невисокосный");
        } else {
            System.out.println("Введенный год високосный");
        }
        in.close();
    }
}
