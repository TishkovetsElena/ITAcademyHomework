package home_work_1;

import java.util.Scanner;

/*
5.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
	5.1 Данный метод будет принима два параметра
	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
	5.3 Первый параметр boolean weekday обозначает рабочий день
	5.4 Второй параметр boolean vacation обозначает отпуск.
	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня не рабочий день? Введите true  или false");
        boolean weekday = in.nextBoolean();
        System.out.println("Сегодня отпуск? Введите true  или false");
        boolean vacation = in.nextBoolean();

        if(sleepIn(weekday,vacation)){
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(weekday || vacation){
            return true;
        }
        return false;
    }
}
