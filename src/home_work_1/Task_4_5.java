package home_work_1;

import java.util.Scanner;
/*
4.5 Буква или иной символ
Вводится целое число, обозначающее код символа по таблице ASCII
Определить, это код английской буквы или какойто иной символ
 */
public class Task_4_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int symbol = in.nextInt();

        if((symbol >= 65  && symbol <= 90)  ||  (symbol >= 97  && symbol <= 122)){
            System.out.println("Введенное число обозначает букву английского алфавита: " + (char)symbol);
        } else {
            System.out.println("Введенное число обозначает не букву английского алфавита, а иной символ: " + (char)symbol) ;
        }
        in.close();
    }
}
