package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {

        int[] array1 = new int[]{1,2,3,4,5,6};
        int[] array2 =new int[]{1,1,1,1};
        int[] array3 = new int[]{9,1,5,99,9,9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6,5,4,3,2,1};

        System.out.println("Сортировка массива при помощи алгоритма пузырьковая сортировка");

        printBubbleSortArray(array1);
        printBubbleSortArray(array2);
        printBubbleSortArray(array3);
        printBubbleSortArray(array4);
        printBubbleSortArray(array5);

        System.out.println("----------------------------------------------------------");
        System.out.println("Сортировка массива при помощи алгоритма шейкерная сортировка");

        array1 = new int[]{1,2,3,4,5,6};
        array2 =new int[]{1,1,1,1};
        array3 = new int[]{9,1,5,99,9,9};
        array4 = new int[]{};
        array5 = new int[]{6,5,4,3,2,1};

        printShakeSortArray(array1);
        printShakeSortArray(array2);
        printShakeSortArray(array3);
        printShakeSortArray(array4);
        printShakeSortArray(array5);

        int[] array6 = ArraysUtils.arrayRandom(50, 100);
        printShakeSortArray(array6);
        array6 = ArraysUtils.arrayRandom(50, 100);
        printBubbleSortArray(array6);


        int[] array7 = ArraysUtils.arrayFromConsole();
        printShakeSortArray(array7);
        array7 = ArraysUtils.arrayFromConsole();
        printBubbleSortArray(array7);
    }

    /**
     * Метод печатает в консоль массив до сортировки и после сортировки алгоритмом пузырьковая сортировка
     * @param array массив целых чисел
     */
    public static void printBubbleSortArray(int[] array){
        System.out.print(Arrays.toString(array));
        SortsUtils.sort(array);
        System.out.println(" -> " +  Arrays.toString(array));
    }

    /**
     * Метод печатает в консоль массив до сортировки и после сортировки алгоритмом шейкерная сортировка
     * @param array массив целых чисел
     */
    public static void printShakeSortArray(int[] array){
        System.out.print(Arrays.toString(array));
        SortsUtils.shake(array);
        System.out.println(" -> " +  Arrays.toString(array));
    }
}
