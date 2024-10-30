package home_work_1;

import java.util.Scanner;

/*
7.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимать
один параметр и будет возвращать строку в отформатированном виде. В метод будет передаваться массив
из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
(Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
В задании нельзя использовать коллекции, стрима.
 */
public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 цифр от 0 до 9:");
        String phone = in.next();

        int[] number = new int[phone.length()];
        for (int i = 0; i < phone.length(); i++) {
            number[i] = Character.getNumericValue(phone.charAt(i));
        }

        System.out.println(createPhoneNumber(number));
        in.close();
    }

    public static String createPhoneNumber(int[] array){
        StringBuilder phoneNumber = new StringBuilder();
        if (array.length != 10) {
            throw new IllegalArgumentException("Array must contain exactly 10 integers.");
        }

        phoneNumber.append("(").append(array[0]).append(array[1]).append(array[2]).append(") ")
                   .append(array[3]).append(array[4]).append(array[5]).append("-").append(array[6])
                   .append(array[7]).append(array[8]).append(array[9]);
        String result = phoneNumber.toString();
      return  result;
    }
}
