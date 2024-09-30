package home_work_1;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(5 + 2 / 8);     // = 5 + 0.25 = 5.25 Ответ 5

        System.out.println((5 + 2) / 8);   // = 7/8 =  0.875 Ответ 0

        int a = 2;
        System.out.println((5 + a++) / 8); // = (5 + 2)/8 = 7/8 =  0.875  Ответ 0

        int a1 = 2;
        int b1 = 8;
        System.out.println((5 + a1++) / --b1); // = (5 + 2)/7 = 7/7 = 1  Ответ 1

        int a2 = 2;
        int b2 = 8;
        System.out.println((5 * 2 >> a2++) / --b2); // (10>>2)/7 = 2/7 = 0.29  Ответ 0

        int a3 = 2;
        int b3 = 8;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a3++) / --b3); //  Ответ 1
        // 12>20 - false, выполняем
        // 22*2>>a3++ = 44>>2 = 11, 11/7 = 1.57

        int a4 = 2;
        int b4 = 8;
        //System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a4++)/--b4); // //Ответ ошибка компиляции
        // в первой части тернарного оператора результат выражения bolean, который невозможно делить на число
        // 12>20 - false, выполняем
        //22 * 2 >> a4++ = 44>>2 = 11, 11/7 = 1.57


        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); //Ответ false
        // 4>3 && 144<=119
        //true&&false

        System.out.println(true && false); //Ответ false
    }
}
