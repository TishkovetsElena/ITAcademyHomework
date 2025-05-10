package home_work_2.arrays;

import java.util.Arrays;

public class ArraysTask_2_4 {
    /**
     * 2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе,
     * в отдельных методах. Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
     * 2.4.1. Сумма четных положительных элементов массива
     * В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов
     * 2.4.2. Максимальный из элементов массива с четными индексами
     * В массиве найти максимальный элемент с четным индексом. Другая формулировка задачи: среди элементов массива
     * с четными индексами, найти тот, который имеет максимальное значение
     * 2.4.3. Элементы массива, которые меньше среднего арифметического
     * Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого от всех элементов массива
     * 2.4.4. Найти два наименьших (минимальных) элемента массива
     * В одномерном массива целых чисел определить два наименьших элемента. Они могут быть как равны между собой
     * (оба являются минимальными), так и различаться
     * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     * Сжать массив, удалив из него все элементы, величина которых находится в интервале [a, b]. Освободившиеся
     * в конце массива элементы заполнить нулями
     * 2.4.6. Сумма цифр массива
     * Найти сумму всех чисел целочисленного массива. Например, если дан массив [12, 104, 81], то сумма всех
     * его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17
     */
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int[] arrayExample = {12, 104, 81, 5, 11, 10};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(sumEvenDigits(array));

        System.out.println(maxElementWithEvenIndex(array));

        int[] array1 = listArrayElementsLessAverage(array);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array2 = twoMinElements(array);
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array3 = compressedArray(array, 18, 45);
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(sumElementsArray(arrayExample));
    }

    /**
     * Метод принимает массив целых чисел и вычисляет сумму четных положительных элементов массива
     * @param array массив целых чисел
     * @return целое число, сумму четных положительных элементов массива
     */
    public static int sumEvenDigits(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    /**
     * Метод принимает массив целых чисел и определяет максимальный из элементов массива с четными индексами
     * @param array массив целых чисел
     * @return целое число, максимальное из элементов массива с четными индексами
     */
    public static int maxElementWithEvenIndex(int[] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (array[i] > maxElement) {
                    maxElement = array[i];
                }
            }
        }
        return maxElement;
    }

    /**
     * Метод принимает массив целых чисел и находит элементы массива, которые меньше среднего арифметического
     * @param array массив целых чисел
     * @return массив чисел из элементов переданного массива, которые меньше среднего арифметического
     */
    public static int[] listArrayElementsLessAverage(int[] array) {
        int[] elementsArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int average = Math.round(sum / array.length);
        int indexNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                elementsArray[indexNewArray] = array[i];
                indexNewArray++;
            }
        }
        return elementsArray;
    }

    /**
     * Метод принимает массив целых чисел, и находит среди них два наименьших (минимальных) элемента массива
     * @param array массив целых чисел
     * @return массив из двух минимальных элементов переданного массива
     */
    public static int[] twoMinElements(int[] array) {
        int[] minElementsArray = new int[2];
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j +1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < minElementsArray.length; i++) {
            minElementsArray[i] = array[i];
        }
        return minElementsArray;
    }

    /**
     * Метод обрабатывает массив целых чисел, сжимает его, удалив элементы, принадлежащие интервалу
     * @param array массив целых чисел
     * @param indexFrom индекс первого элемента интервала для удаления
     * @param indexTo индекс последнего элемента интревала для удаления
     * @return сжатый массив
     */
    public static int[] compressedArray(int[] array, int indexFrom, int indexTo){
        int[] compressedArray = new int [array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(i < indexFrom || i > indexTo ){
                compressedArray[index] = array[i];
                index++;
            }
        }
        return compressedArray;
    }

    /**
     * Метод суммирует цифры элементов массива
     * @param array массив целых чисел
     * @return целое числоя, сумму цифр массива
     */
    public static int sumElementsArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            while(array[i] > 9){
                sum += array[i] % 10;
                array[i] = array[i] / 10;
            }
            sum += array[i];
            }
        return sum;
    }
}

